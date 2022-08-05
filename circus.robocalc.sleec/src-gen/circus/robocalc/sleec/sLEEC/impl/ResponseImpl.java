/**
 * generated by Xtext 2.25.0
 */
package circus.robocalc.sleec.sLEEC.impl;

import circus.robocalc.sleec.sLEEC.Event;
import circus.robocalc.sleec.sLEEC.Response;
import circus.robocalc.sleec.sLEEC.SLEECPackage;
import circus.robocalc.sleec.sLEEC.TimeUnit;
import circus.robocalc.sleec.sLEEC.Value;

import java.lang.Boolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circus.robocalc.sleec.sLEEC.impl.ResponseImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link circus.robocalc.sleec.sLEEC.impl.ResponseImpl#getValue <em>Value</em>}</li>
 *   <li>{@link circus.robocalc.sleec.sLEEC.impl.ResponseImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link circus.robocalc.sleec.sLEEC.impl.ResponseImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link circus.robocalc.sleec.sLEEC.impl.ResponseImpl#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends MinimalEObjectImpl.Container implements Response
{
  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Event event;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.SECONDS;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected TimeUnit unit = UNIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected Response response;

  /**
   * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected boolean not = NOT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResponseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SLEECPackage.Literals.RESPONSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Event getEvent()
  {
    if (event != null && event.eIsProxy())
    {
      InternalEObject oldEvent = (InternalEObject)event;
      event = (Event)eResolveProxy(oldEvent);
      if (event != oldEvent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SLEECPackage.RESPONSE__EVENT, oldEvent, event));
      }
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event basicGetEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEvent(Event newEvent)
  {
    Event oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SLEECPackage.RESPONSE__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLEECPackage.RESPONSE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SLEECPackage.RESPONSE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SLEECPackage.RESPONSE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SLEECPackage.RESPONSE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUnit getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnit(TimeUnit newUnit)
  {
    TimeUnit oldUnit = unit;
    unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SLEECPackage.RESPONSE__UNIT, oldUnit, unit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Response getResponse()
  {
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResponse(Response newResponse, NotificationChain msgs)
  {
    Response oldResponse = response;
    response = newResponse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLEECPackage.RESPONSE__RESPONSE, oldResponse, newResponse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setResponse(Response newResponse)
  {
    if (newResponse != response)
    {
      NotificationChain msgs = null;
      if (response != null)
        msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SLEECPackage.RESPONSE__RESPONSE, null, msgs);
      if (newResponse != null)
        msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SLEECPackage.RESPONSE__RESPONSE, null, msgs);
      msgs = basicSetResponse(newResponse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SLEECPackage.RESPONSE__RESPONSE, newResponse, newResponse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNot(boolean newNot)
  {
    boolean oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SLEECPackage.RESPONSE__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SLEECPackage.RESPONSE__VALUE:
        return basicSetValue(null, msgs);
      case SLEECPackage.RESPONSE__RESPONSE:
        return basicSetResponse(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SLEECPackage.RESPONSE__EVENT:
        if (resolve) return getEvent();
        return basicGetEvent();
      case SLEECPackage.RESPONSE__VALUE:
        return getValue();
      case SLEECPackage.RESPONSE__UNIT:
        return getUnit();
      case SLEECPackage.RESPONSE__RESPONSE:
        return getResponse();
      case SLEECPackage.RESPONSE__NOT:
        return isNot();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SLEECPackage.RESPONSE__EVENT:
        setEvent((Event)newValue);
        return;
      case SLEECPackage.RESPONSE__VALUE:
        setValue((Value)newValue);
        return;
      case SLEECPackage.RESPONSE__UNIT:
        setUnit((TimeUnit)newValue);
        return;
      case SLEECPackage.RESPONSE__RESPONSE:
        setResponse((Response)newValue);
        return;
      case SLEECPackage.RESPONSE__NOT:
        setNot((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SLEECPackage.RESPONSE__EVENT:
        setEvent((Event)null);
        return;
      case SLEECPackage.RESPONSE__VALUE:
        setValue((Value)null);
        return;
      case SLEECPackage.RESPONSE__UNIT:
        setUnit(UNIT_EDEFAULT);
        return;
      case SLEECPackage.RESPONSE__RESPONSE:
        setResponse((Response)null);
        return;
      case SLEECPackage.RESPONSE__NOT:
        setNot(NOT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SLEECPackage.RESPONSE__EVENT:
        return event != null;
      case SLEECPackage.RESPONSE__VALUE:
        return value != null;
      case SLEECPackage.RESPONSE__UNIT:
        return unit != UNIT_EDEFAULT;
      case SLEECPackage.RESPONSE__RESPONSE:
        return response != null;
      case SLEECPackage.RESPONSE__NOT:
        return not != NOT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (unit: ");
    result.append(unit);
    result.append(", not: ");
    result.append(not);
    result.append(')');
    return result.toString();
  }

} //ResponseImpl
