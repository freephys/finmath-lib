/*
 * (c) Copyright Christian P. Fries, Germany. All rights reserved. Contact: email@christian-fries.de.
 *
 * Created on 24.12.2016
 */
package net.finmath.montecarlo.interestrate.modelplugins;

import net.finmath.montecarlo.interestrate.TermStructureModelInterface;
import net.finmath.stochastic.RandomVariableInterface;
import net.finmath.time.TimeDiscretizationInterface;

/**
 * A base class and interface description for the instantaneous covariance of
 * an forward rate interest rate model.
 * 
 * @author Christian Fries
 */
public interface TermStructureCovarianceModelInterface extends TermStructureTenorTimeScalingInterface, TermStructureFactorLoadingsModelInterface {
}
