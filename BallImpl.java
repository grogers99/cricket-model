/**
 */
package model.impl;

import model.Ball;
import model.BallType;
import model.ModelPackage;

import model.Player;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ball</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.BallImpl#getRuns <em>Runs</em>}</li>
 *   <li>{@link model.impl.BallImpl#getRunValue <em>Run Value</em>}</li>
 *   <li>{@link model.impl.BallImpl#isSwitchEnds <em>Switch Ends</em>}</li>
 *   <li>{@link model.impl.BallImpl#getBatsman <em>Batsman</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BallImpl extends MinimalEObjectImpl.Container implements Ball {
	/**
	 * The default value of the '{@link #getRuns() <em>Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
	protected static final BallType RUNS_EDEFAULT = BallType.DOT_BALL;

	/**
	 * The cached value of the '{@link #getRuns() <em>Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
	protected BallType runs = RUNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunValue() <em>Run Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunValue()
	 * @generated
	 * @ordered
	 */
	protected static final int RUN_VALUE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isSwitchEnds() <em>Switch Ends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwitchEnds()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SWITCH_ENDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getBatsman() <em>Batsman</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatsman()
	 * @generated
	 * @ordered
	 */
	protected Player batsman;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BallType getRuns() {
		return runs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuns(BallType newRuns) {
		BallType oldRuns = runs;
		runs = newRuns == null ? RUNS_EDEFAULT : newRuns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BALL__RUNS, oldRuns, runs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getBatsman() {
		if (batsman != null && batsman.eIsProxy()) {
			InternalEObject oldBatsman = (InternalEObject)batsman;
			batsman = (Player)eResolveProxy(oldBatsman);
			if (batsman != oldBatsman) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BALL__BATSMAN, oldBatsman, batsman));
			}
		}
		return batsman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetBatsman() {
		return batsman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBatsman(Player newBatsman, NotificationChain msgs) {
		Player oldBatsman = batsman;
		batsman = newBatsman;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.BALL__BATSMAN, oldBatsman, newBatsman);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatsman(Player newBatsman) {
		if (newBatsman != batsman) {
			NotificationChain msgs = null;
			if (batsman != null)
				msgs = ((InternalEObject)batsman).eInverseRemove(this, ModelPackage.PLAYER__BALLS_FACED, Player.class, msgs);
			if (newBatsman != null)
				msgs = ((InternalEObject)newBatsman).eInverseAdd(this, ModelPackage.PLAYER__BALLS_FACED, Player.class, msgs);
			msgs = basicSetBatsman(newBatsman, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BALL__BATSMAN, newBatsman, newBatsman));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BALL__BATSMAN:
				if (batsman != null)
					msgs = ((InternalEObject)batsman).eInverseRemove(this, ModelPackage.PLAYER__BALLS_FACED, Player.class, msgs);
				return basicSetBatsman((Player)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BALL__BATSMAN:
				return basicSetBatsman(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getRunValue() {
		// TODO: implement this method to return the 'Run Value' attribute
		switch (this.getRuns()) {
		case DOT_BALL: {
			return 0;
		}
		case ONE_RUN: {
			return 1;
		}
		case TWO_RUNS: {
			return 2;
		}
		case THREE_RUNS: {
			return 3;
		}
		case FOUR_RUNS: {
			return 4;
		}
		case SIX_RUNS: {
			return 6;
		}
		default: {
			return 0;
		}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSwitchEnds() {
		return (this.getRuns() == BallType.ONE_RUN || this.getRuns() == BallType.THREE_RUNS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BALL__RUNS:
				return getRuns();
			case ModelPackage.BALL__RUN_VALUE:
				return getRunValue();
			case ModelPackage.BALL__SWITCH_ENDS:
				return isSwitchEnds();
			case ModelPackage.BALL__BATSMAN:
				if (resolve) return getBatsman();
				return basicGetBatsman();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BALL__RUNS:
				setRuns((BallType)newValue);
				return;
			case ModelPackage.BALL__BATSMAN:
				setBatsman((Player)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.BALL__RUNS:
				setRuns(RUNS_EDEFAULT);
				return;
			case ModelPackage.BALL__BATSMAN:
				setBatsman((Player)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.BALL__RUNS:
				return runs != RUNS_EDEFAULT;
			case ModelPackage.BALL__RUN_VALUE:
				return getRunValue() != RUN_VALUE_EDEFAULT;
			case ModelPackage.BALL__SWITCH_ENDS:
				return isSwitchEnds() != SWITCH_ENDS_EDEFAULT;
			case ModelPackage.BALL__BATSMAN:
				return batsman != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (runs: ");
		result.append(runs);
		result.append(')');
		return result.toString();
	}

} //BallImpl
