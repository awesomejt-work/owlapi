/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.semanticweb.owlapi.api.test.classexpressions;

import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import org.semanticweb.owlapi.api.test.baseclasses.AbstractOWLDataCardinalityRestrictionTestCase;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataCardinalityRestriction;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLObjectCardinalityRestriction;
import org.semanticweb.owlapi.model.OWLObjectProperty;

/** Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group Date: 25-Oct-2006 */
public class OWLDataMaxCardinalityTestCase extends
        AbstractOWLDataCardinalityRestrictionTestCase {
    @Override
    protected OWLDataCardinalityRestriction createDataRestriction(OWLDataProperty prop,
            int cardinality) {
        return DataMaxCardinality(cardinality, prop, TopDatatype());
    }

    @Override
    protected OWLDataCardinalityRestriction createDataRestriction(OWLDataProperty prop,
            int cardinality, OWLDataRange dataRange) {
        return DataMaxCardinality(cardinality, prop, dataRange);
    }

    @Override
    protected OWLObjectCardinalityRestriction createObjectRestriction(
            OWLObjectProperty prop) {
        return ObjectMaxCardinality(1, prop, OWLThing());
    }

    protected OWLObjectCardinalityRestriction createObjectRestriction(
            OWLObjectProperty prop, int cardinality) {
        return ObjectMaxCardinality(cardinality, prop, OWLThing());
    }

    protected OWLObjectCardinalityRestriction createObjectRestriction(
            OWLObjectProperty prop, int cardinality, OWLClassExpression dataRange) {
        return ObjectMaxCardinality(cardinality, prop, dataRange);
    }
}
