/*
 * Copyright 2019 Google LLC
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
package com.intellij.protobuf.lang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.protobuf.ide.util.PbIcons;
import com.intellij.protobuf.lang.psi.PbExtendDefinition;
import com.intellij.protobuf.lang.psi.PbTypeName;
import com.intellij.protobuf.lang.stub.PbExtendDefinitionStub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

abstract class PbExtendDefinitionMixin extends PbStubbedDefinitionBase<PbExtendDefinitionStub>
    implements PbExtendDefinition {

  PbExtendDefinitionMixin(ASTNode node) {
    super(node);
  }

  PbExtendDefinitionMixin(PbExtendDefinitionStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  @Nullable
  @Override
  public Icon getIcon(int flags) {
    return PbIcons.EXTEND;
  }

  @NotNull
  @Override
  public String getPresentableText() {
    PbTypeName typeName = getTypeName();
    if (typeName != null) {
      return "extend " + typeName.getReferenceString();
    }
    return getText();
  }
}
