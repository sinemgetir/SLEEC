/*
 * generated by Xtext 2.25.0
 */
package circus.robocalc.sleec.tests

import circus.robocalc.sleec.sLEEC.Specification
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(SLEECInjectorProvider)
class SLEECParsingTest {
	@Inject ParseHelper<Specification> parseHelper
	
	
	@Test
	def void basic_test() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
			def_end
			rule_start
				Rule1 when E0 then E1
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void test_within() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
			def_end
			rule_start
				Rule1 when E0 then E1 within 2 minutes
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void test_tigger_event() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
				event E2
			def_end
			rule_start
				Rule1 when E1 and E2 then E3
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}

	@Test
	def void test_boolean() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
				measure m0: boolean
			def_end
			rule_start
				Rule1 when E0 and m0 then E1
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void test_bool_op() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
				measure m0: boolean
				measure m1: boolean
			def_end
			rule_start
				Rule1 when E0 and m0 or m1 then E1
				Rule2 when E0 and m0 and m1 then E1
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void test_not_expr() {
		// rules 1 and 3 should be different and rules 1 and 2 should be the same
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
			def_end
			rule_start
				Rule1 when E0 and not m0 or m1 then E1
				Rule3 when E0 and not (m0 or m1) then E1
				Rule2 when E0 and not (m0 and not m1) then E1
			rule_end
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void test_numeric() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
				measure m0: numeric
				measure m1: numeric
			def_end
			rule_start
				Rule1 when E0 then E1
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void test_relop() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
				measure m0: numeric
				measure m1: numeric
			def_end
			rule_start
				Rule1 when E0 and m0 > m1 then E1
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}	
	
	@Test
	def void test_const() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
				measure m0: numeric
				constant C0 = 1
			def_end
			rule_start
				Rule1 when E0 and m0 > C0 then E1
				Rule2 when E0 then E1 within C0 days
			rule_end
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty,'''Unexted errors:«errors.join(", ")»''')
	}
	
	@Test
	def void test_scale() {
		var result = parseHelper.parse('''
			def_start
				measure m0: scale(s0, s1, s2)
				event E0
				event E1
			def_end
			rule_start
				Rule1 when E0 and m0 > s0 then E1
				Rule2 when E0 and m0 = s1 then E1
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void test_precidence() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event d1
			def_end
			rule_start
				Rule1 when E0 and 0 < 1 and 0 <> 0 or not 1 = 1 then E1
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
		/*
		 * check that the parse tree for the operations in rule.trigger is correct according to the grammar
		 */
	}
	
	@Test
	def void test_otherwise() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
				event E2
				event E3
			def_end
			rule_start
				Rule1 when E0 then E1 within 1 seconds otherwise E2
				Rule2 when E0 then E1 within 1 seconds otherwise E2 within 0 seconds
				Rule3 when E0 then E1 within 0 seconds otherwise E2 within 2 seconds unless E3
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void test_not_response() {
		val result = parseHelper.parse('''
			def_start
				event E0
				event E1
				event E2
			def_end
			rule_start
				Rule1 when E0 then not E1 within 0 seconds
				Rule1 when E0 then E1 within 1 seconds otherwise not E2 within 3 seconds
			rule_end
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty,'''Unexpeted errors: «errors.join(", ")»''')
	}
	
	@Test
	def void test_defeaters() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
				event E2
				measure m0: boolean
				measure m1: boolean
			def_end
			rule_start
				Rule1 when E0 then E1
					unless m0 then E2
					unless m1
			rule_end
		''')
		Assertions.assertNotNull(result)
	    val errors = result.eResource.errors
	    Assertions.assertTrue(errors.isEmpty,'''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void test_complex() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
				event E2
				event E3
				event E4
				event E5
				measure m0: boolean
				measure m1: numeric
				measure m2: scale(s0, s1)
				constant C0 = 5
				constant C1 = 7
			def_end
			rule_start
				Rule1 when E0 and m0 and (m1 < C0 or m2 > s0) or m1 < 5 then E1 within C0 minutes otherwise not E2 within C1 minutes
					unless m1 <> C0 and (m0 or m1 < 5) then E3 within C1 seconds otherwise E4 within 3 hours otherwise E5
			rule_end
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty,'''Unexpected errors:«errors.join(", ")»''')
	}
	
	@Test
	def void test_comment() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
			def_end
			rule_start
				// Rule1 when E0 then E2
				Rule1 when E0 then E1
			rule_end
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty,'''Unexpected errors:«errors.join(", ")»''')
	}
	
	@Test
	def void test_time_unit() {
		var result = parseHelper.parse('''
			def_start
				event E0
				event E1
				event E2
				event E3
				event E4
				constant C0 = 5
				constant C1 = 6.7
			def_end
			rule_start
				Rule1 when E0 then E1 within 2 seconds
					otherwise E2 within 3.4 minutes
					otherwise E3 within C0 hours
					otherwise E4 within C1 days
			rule_end
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty,'''Unexpected errors«errors.join(", ")»''')
	}
}
