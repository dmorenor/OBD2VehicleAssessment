/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.example.danny.obd2vehicleassessment.commands.pressure;

import com.example.danny.obd2vehicleassessment.enums.AvailableCommandNames;

/**
 * Intake Manifold Pressure
 *
 */
public class IntakeManifoldPressureCommand extends PressureCommand {

    /**
     * Default ctor.
     */
    public IntakeManifoldPressureCommand() {
        super("01 0B");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.example.danny.obd2vehicleassessment.commands.pressure.IntakeManifoldPressureCommand} object.
     */
    public IntakeManifoldPressureCommand(IntakeManifoldPressureCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.INTAKE_MANIFOLD_PRESSURE.getValue();
    }

}