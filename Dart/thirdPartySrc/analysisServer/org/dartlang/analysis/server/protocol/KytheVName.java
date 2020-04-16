/*
 * Copyright (c) 2019, the Dart project authors. Please see the AUTHORS file
 * for details. All rights reserved. Use of this source code is governed by a
 * BSD-style license that can be found in the LICENSE file.
 *
 * This file has been automatically generated. Please do not edit it manually.
 * To regenerate the file, use the script "pkg/analysis_server/tool/spec/generate_files".
 */
package org.dartlang.analysis.server.protocol;

import java.util.List;

import com.google.dart.server.utilities.general.ObjectUtilities;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This object matches the format and documentation of the Vector-Name object documented in the
 * Kythe Storage Model.
 *
 * @coverage dart.server.generated.types
 */
@SuppressWarnings("unused")
public class KytheVName {

  public static final KytheVName[] EMPTY_ARRAY = new KytheVName[0];

  public static final List<KytheVName> EMPTY_LIST = new ArrayList<>();

  /**
   * An opaque signature generated by the analyzer.
   */
  private final String signature;

  /**
   * The corpus of source code this KytheVName belongs to. Loosely, a corpus is a collection of
   * related files, such as the contents of a given source repository.
   */
  private final String corpus;

  /**
   * A corpus-specific root label, typically a directory path or project identifier, denoting a
   * distinct subset of the corpus. This may also be used to designate virtual collections like
   * generated files.
   */
  private final String root;

  /**
   * A path-structured label describing the “location” of the named object relative to the corpus and
   * the root.
   */
  private final String path;

  /**
   * The language this name belongs to.
   */
  private final String language;

  /**
   * Constructor for {@link KytheVName}.
   */
  public KytheVName(String signature, String corpus, String root, String path, String language) {
    this.signature = signature;
    this.corpus = corpus;
    this.root = root;
    this.path = path;
    this.language = language;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof KytheVName) {
      KytheVName other = (KytheVName) obj;
      return
        ObjectUtilities.equals(other.signature, signature) &&
        ObjectUtilities.equals(other.corpus, corpus) &&
        ObjectUtilities.equals(other.root, root) &&
        ObjectUtilities.equals(other.path, path) &&
        ObjectUtilities.equals(other.language, language);
    }
    return false;
  }

  public static KytheVName fromJson(JsonObject jsonObject) {
    String signature = jsonObject.get("signature").getAsString();
    String corpus = jsonObject.get("corpus").getAsString();
    String root = jsonObject.get("root").getAsString();
    String path = jsonObject.get("path").getAsString();
    String language = jsonObject.get("language").getAsString();
    return new KytheVName(signature, corpus, root, path, language);
  }

  public static List<KytheVName> fromJsonArray(JsonArray jsonArray) {
    if (jsonArray == null) {
      return EMPTY_LIST;
    }
    ArrayList<KytheVName> list = new ArrayList<KytheVName>(jsonArray.size());
    Iterator<JsonElement> iterator = jsonArray.iterator();
    while (iterator.hasNext()) {
      list.add(fromJson(iterator.next().getAsJsonObject()));
    }
    return list;
  }

  /**
   * The corpus of source code this KytheVName belongs to. Loosely, a corpus is a collection of
   * related files, such as the contents of a given source repository.
   */
  public String getCorpus() {
    return corpus;
  }

  /**
   * The language this name belongs to.
   */
  public String getLanguage() {
    return language;
  }

  /**
   * A path-structured label describing the “location” of the named object relative to the corpus and
   * the root.
   */
  public String getPath() {
    return path;
  }

  /**
   * A corpus-specific root label, typically a directory path or project identifier, denoting a
   * distinct subset of the corpus. This may also be used to designate virtual collections like
   * generated files.
   */
  public String getRoot() {
    return root;
  }

  /**
   * An opaque signature generated by the analyzer.
   */
  public String getSignature() {
    return signature;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(signature);
    builder.append(corpus);
    builder.append(root);
    builder.append(path);
    builder.append(language);
    return builder.toHashCode();
  }

  public JsonObject toJson() {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("signature", signature);
    jsonObject.addProperty("corpus", corpus);
    jsonObject.addProperty("root", root);
    jsonObject.addProperty("path", path);
    jsonObject.addProperty("language", language);
    return jsonObject;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[");
    builder.append("signature=");
    builder.append(signature + ", ");
    builder.append("corpus=");
    builder.append(corpus + ", ");
    builder.append("root=");
    builder.append(root + ", ");
    builder.append("path=");
    builder.append(path + ", ");
    builder.append("language=");
    builder.append(language);
    builder.append("]");
    return builder.toString();
  }

}
