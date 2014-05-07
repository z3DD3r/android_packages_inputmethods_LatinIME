/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.inputmethod.keyboard.layout.tests;

import android.test.suitebuilder.annotation.SmallTest;

import com.android.inputmethod.keyboard.layout.LayoutBase;
import com.android.inputmethod.keyboard.layout.Marathi;
import com.android.inputmethod.keyboard.layout.Marathi.MarathiCustomizer;

import java.util.Locale;

/**
 * mr_IN: Marathi (India)/marathi
 */
@SmallTest
public final class TestsMarathiIN extends LayoutTestsBase {
    private static final Locale LOCALE = new Locale("mr", "IN");
    private static final LayoutBase LAYOUT = new Marathi(new MarathiCustomizer(LOCALE));

    @Override
    LayoutBase getLayout() { return LAYOUT; }
}