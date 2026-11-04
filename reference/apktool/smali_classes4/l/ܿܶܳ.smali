.class public final Ll/ܿܶܳ;
.super Ljava/lang/Object;
.source "36GP"


# direct methods
.method public static ۙ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 197
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 199
    instance-of v0, p0, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 200
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unable to read accessibility property: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ۙ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/util/LinkedHashMap;
    .locals 9

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 179
    :cond_0
    :try_start_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 180
    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 181
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getWindowId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v2

    .line 182
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getViewIdResourceName()Ljava/lang/String;

    move-result-object v4

    .line 183
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v0}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v0

    const/16 v6, 0xc

    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, "window-id"

    const/4 v8, 0x0

    aput-object v7, v6, v8

    const/4 v7, 0x1

    aput-object v1, v6, v7

    const-string v1, "package"

    const/4 v7, 0x2

    aput-object v1, v6, v7

    const/4 v1, 0x3

    aput-object v2, v6, v1

    const-string v1, "class"

    const/4 v2, 0x4

    aput-object v1, v6, v2

    const/4 v1, 0x5

    aput-object v3, v6, v1

    const-string v1, "resource-id"

    const/4 v2, 0x6

    aput-object v1, v6, v2

    const/4 v1, 0x7

    aput-object v4, v6, v1

    const-string v1, "text"

    const/16 v2, 0x8

    aput-object v1, v6, v2

    const/16 v1, 0x9

    aput-object v5, v6, v1

    const-string v1, "bounds"

    const/16 v2, 0xa

    aput-object v1, v6, v2

    const/16 v1, 0xb

    aput-object v0, v6, v1

    .line 181
    invoke-static {v6}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 184
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_1

    const-string v1, "unique-id"

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getUniqueId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    :cond_1
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V

    throw v0
.end method

.method public static ۙ(Ljava/lang/Object;)Ljava/util/LinkedHashMap;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "getNode"

    .line 191
    invoke-static {p0, v0}, Ll/ܿܶܳ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v0}, Ll/ܿܶܳ;->ۙ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/util/LinkedHashMap;

    move-result-object v0

    const-string v1, "getOffset"

    .line 192
    invoke-static {p0, v1}, Ll/ܿܶܳ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "node"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const-string v0, "offset"

    const/4 v2, 0x2

    aput-object v0, v1, v2

    const/4 v0, 0x3

    aput-object p0, v1, v0

    .line 191
    invoke-static {v1}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;
    .locals 4

    .line 205
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v1, 0x0

    .line 206
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-object v2, p0, v1

    check-cast v2, Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    aget-object v3, p0, v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۙ(Landroid/util/JsonWriter;Ljava/lang/Object;Ljava/util/IdentityHashMap;I)V
    .locals 4

    const/16 v0, 0x80

    if-gt p3, v0, :cond_16

    if-nez p1, :cond_0

    .line 237
    invoke-virtual {p0}, Landroid/util/JsonWriter;->nullValue()Landroid/util/JsonWriter;

    return-void

    .line 238
    :cond_0
    instance-of v0, p1, Ljava/lang/CharSequence;

    if-nez v0, :cond_15

    instance-of v0, p1, Ljava/lang/Character;

    if-eqz v0, :cond_1

    goto/16 :goto_8

    .line 239
    :cond_1
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    return-void

    .line 240
    :cond_2
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_5

    .line 242
    move-object p2, p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    .line 243
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result p3

    if-nez p3, :cond_4

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_0

    .line 244
    :cond_3
    invoke-virtual {p0, p2}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    return-void

    .line 243
    :cond_4
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    return-void

    .line 247
    :cond_5
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_14

    .line 249
    :try_start_0
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_7

    .line 250
    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    .line 251
    invoke-virtual {p0}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 252
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 253
    invoke-virtual {p0, v2}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 254
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, p3, 0x1

    invoke-static {p0, v2, p2, v3}, Ll/ܿܶܳ;->ۙ(Landroid/util/JsonWriter;Ljava/lang/Object;Ljava/util/IdentityHashMap;I)V

    goto :goto_1

    .line 256
    :cond_6
    invoke-virtual {p0}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    goto/16 :goto_7

    .line 257
    :cond_7
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_9

    .line 258
    invoke-virtual {p0}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 259
    move-object v0, p1

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 260
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 261
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, p3, 0x1

    invoke-static {p0, v1, p2, v2}, Ll/ܿܶܳ;->ۙ(Landroid/util/JsonWriter;Ljava/lang/Object;Ljava/util/IdentityHashMap;I)V

    goto :goto_2

    .line 263
    :cond_8
    invoke-virtual {p0}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    goto/16 :goto_7

    .line 264
    :cond_9
    instance-of v0, p1, Ljava/lang/Iterable;

    if-eqz v0, :cond_b

    .line 265
    invoke-virtual {p0}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 266
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, p3, 0x1

    invoke-static {p0, v1, p2, v2}, Ll/ܿܶܳ;->ۙ(Landroid/util/JsonWriter;Ljava/lang/Object;Ljava/util/IdentityHashMap;I)V

    goto :goto_3

    .line 267
    :cond_a
    invoke-virtual {p0}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    goto/16 :goto_7

    .line 268
    :cond_b
    instance-of v0, p1, Landroid/util/SparseArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    .line 269
    move-object v0, p1

    check-cast v0, Landroid/util/SparseArray;

    .line 270
    invoke-virtual {p0}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 271
    :goto_4
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_c

    .line 272
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 273
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, p3, 0x1

    invoke-static {p0, v2, p2, v3}, Ll/ܿܶܳ;->ۙ(Landroid/util/JsonWriter;Ljava/lang/Object;Ljava/util/IdentityHashMap;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 275
    :cond_c
    invoke-virtual {p0}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    goto/16 :goto_7

    .line 276
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 277
    invoke-virtual {p0}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 278
    :goto_5
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    if-ge v1, v0, :cond_e

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v2, p3, 0x1

    invoke-static {p0, v0, p2, v2}, Ll/ܿܶܳ;->ۙ(Landroid/util/JsonWriter;Ljava/lang/Object;Ljava/util/IdentityHashMap;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 279
    :cond_e
    invoke-virtual {p0}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    goto/16 :goto_7

    .line 280
    :cond_f
    instance-of p3, p1, Landroid/graphics/Rect;

    if-eqz p3, :cond_10

    .line 281
    move-object p3, p1

    check-cast p3, Landroid/graphics/Rect;

    invoke-virtual {p3}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    goto/16 :goto_7

    .line 282
    :cond_10
    instance-of p3, p1, Landroid/graphics/RectF;

    if-eqz p3, :cond_11

    .line 283
    move-object p3, p1

    check-cast p3, Landroid/graphics/RectF;

    .line 284
    invoke-virtual {p0}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    move-result-object p0

    iget v0, p3, Landroid/graphics/RectF;->left:F

    float-to-double v0, v0

    invoke-virtual {p0, v0, v1}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    move-result-object p0

    iget v0, p3, Landroid/graphics/RectF;->top:F

    float-to-double v0, v0

    invoke-virtual {p0, v0, v1}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    move-result-object p0

    iget v0, p3, Landroid/graphics/RectF;->right:F

    float-to-double v0, v0

    invoke-virtual {p0, v0, v1}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    move-result-object p0

    iget p3, p3, Landroid/graphics/RectF;->bottom:F

    float-to-double v0, p3

    invoke-virtual {p0, v0, v1}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    move-result-object p0

    invoke-virtual {p0}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    goto :goto_7

    .line 285
    :cond_11
    instance-of p3, p1, Landroid/graphics/Region;

    if-eqz p3, :cond_13

    .line 286
    invoke-virtual {p0}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 287
    new-instance p3, Landroid/graphics/RegionIterator;

    move-object v0, p1

    check-cast v0, Landroid/graphics/Region;

    invoke-direct {p3, v0}, Landroid/graphics/RegionIterator;-><init>(Landroid/graphics/Region;)V

    .line 288
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 289
    :goto_6
    invoke-virtual {p3, v0}, Landroid/graphics/RegionIterator;->next(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {v0}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    goto :goto_6

    .line 290
    :cond_12
    invoke-virtual {p0}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    goto :goto_7

    .line 293
    :cond_13
    invoke-virtual {p0}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    move-result-object p0

    const-string p3, "type"

    invoke-virtual {p0, p3}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object p0

    const-string p3, "value"

    .line 294
    invoke-virtual {p0, p3}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object p0

    invoke-virtual {p0}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 296
    :goto_7
    invoke-virtual {p2, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p2, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw p0

    .line 247
    :cond_14
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Cyclic accessibility property"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 238
    :cond_15
    :goto_8
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    return-void

    .line 236
    :cond_16
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Accessibility property nesting exceeds limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Lorg/xmlpull/v1/XmlSerializer;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 37
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 38
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInParent(Landroid/graphics/Rect;)V

    const-string v3, "bounds-in-parent"

    .line 39
    invoke-virtual {v2}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v3, v4}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getWindowId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "window-id"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "child-count"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isAccessibilityFocused()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "accessibility-focused"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isEditable()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "editable"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isContentInvalid()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "content-invalid"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isDismissable()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "dismissable"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isMultiLine()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "multi-line"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->canOpenPopup()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "can-open-popup"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getInputType()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "input-type"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getLiveRegion()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "live-region"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "movement-granularities"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getTextSelectionStart()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "text-selection-start"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getTextSelectionEnd()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "text-selection-end"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMaxTextLength()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "max-text-length"

    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "error"

    .line 54
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getError()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v0, v3, v4}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getActionList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x5

    const/4 v7, 0x6

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 57
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getId()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getLabel()Ljava/lang/CharSequence;

    move-result-object v14

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v7, v7, [Ljava/lang/Object;

    const-string v15, "id"

    aput-object v15, v7, v12

    aput-object v13, v7, v11

    const-string v11, "label"

    aput-object v11, v7, v10

    aput-object v14, v7, v9

    const-string v9, "description"

    aput-object v9, v7, v8

    aput-object v5, v7, v6

    invoke-static {v7}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v4, "actions"

    .line 58
    invoke-static {v0, v4, v3}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getRangeInfo()Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object v3

    const/16 v4, 0x8

    if-nez v3, :cond_1

    const/4 v3, 0x7

    const/4 v3, 0x0

    const/16 v16, 0x7

    goto :goto_1

    .line 131
    :cond_1
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->getType()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->getMin()F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    .line 132
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->getMax()F

    move-result v15

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->getCurrent()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/16 v16, 0x7

    new-array v5, v4, [Ljava/lang/Object;

    const-string v17, "type"

    aput-object v17, v5, v12

    aput-object v13, v5, v11

    const-string v13, "min"

    aput-object v13, v5, v10

    aput-object v14, v5, v9

    const-string v13, "max"

    aput-object v13, v5, v8

    aput-object v15, v5, v6

    const-string v6, "current"

    aput-object v6, v5, v7

    aput-object v3, v5, v16

    .line 131
    invoke-static {v5}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v3

    :goto_1
    const-string v5, "range-info"

    .line 59
    invoke-static {v0, v5, v3}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 60
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getCollectionInfo()Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object v3

    const/16 v5, 0x23

    if-nez v3, :cond_2

    const/4 v3, 0x5

    const/4 v4, 0x0

    goto :goto_2

    .line 137
    :cond_2
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->getRowCount()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->getColumnCount()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    .line 138
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->isHierarchical()Z

    move-result v14

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->getSelectionMode()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v17, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const-string v18, "row-count"

    aput-object v18, v4, v12

    aput-object v6, v4, v11

    const-string v6, "column-count"

    aput-object v6, v4, v10

    aput-object v13, v4, v9

    const-string v6, "hierarchical"

    aput-object v6, v4, v8

    aput-object v14, v4, v17

    const-string v6, "selection-mode"

    aput-object v6, v4, v7

    aput-object v15, v4, v16

    .line 137
    invoke-static {v4}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v4

    .line 139
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v5, :cond_3

    .line 140
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->getItemCount()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v13, "item-count"

    invoke-interface {v4, v13, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->getImportantForAccessibilityItemCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v6, "important-for-accessibility-item-count"

    invoke-interface {v4, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 v3, 0x5

    :goto_2
    const-string v6, "collection-info"

    .line 60
    invoke-static {v0, v6, v4}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getCollectionItemInfo()Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object v4

    const-string v6, "heading"

    const/16 v13, 0x21

    if-nez v4, :cond_4

    const/4 v5, 0x0

    goto/16 :goto_3

    .line 148
    :cond_4
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getRowIndex()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getColumnIndex()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    .line 149
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getRowSpan()I

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getColumnSpan()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    .line 150
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->isHeading()Z

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v19

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->isSelected()Z

    move-result v20

    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v20

    const/16 v21, 0x8

    const/16 v5, 0xc

    new-array v5, v5, [Ljava/lang/Object;

    const-string v22, "row-index"

    aput-object v22, v5, v12

    aput-object v14, v5, v11

    const-string v14, "column-index"

    aput-object v14, v5, v10

    aput-object v15, v5, v9

    const-string v9, "row-span"

    aput-object v9, v5, v8

    aput-object v17, v5, v3

    const-string v9, "column-span"

    aput-object v9, v5, v7

    aput-object v18, v5, v16

    aput-object v6, v5, v21

    const/16 v9, 0x9

    aput-object v19, v5, v9

    const-string v9, "selected"

    const/16 v10, 0xa

    aput-object v9, v5, v10

    const/16 v9, 0xb

    aput-object v20, v5, v9

    .line 148
    invoke-static {v5}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v5

    .line 151
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v9, v13, :cond_5

    const-string v9, "row-title"

    const/4 v10, 0x3

    .line 152
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getRowTitle()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v5, v9, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "column-title"

    .line 153
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getColumnTitle()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v10, 0x3

    :goto_4
    const-string v4, "collection-item-info"

    .line 61
    invoke-static {v0, v4, v5}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "extras"

    .line 62
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-static {v0, v4, v5}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getLabelFor()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-static {v4}, Ll/ܿܶܳ;->ۙ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/util/LinkedHashMap;

    move-result-object v4

    const-string v5, "label-for"

    invoke-static {v0, v5, v4}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getLabeledBy()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-static {v4}, Ll/ܿܶܳ;->ۙ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/util/LinkedHashMap;

    move-result-object v4

    const-string v5, "labeled-by"

    invoke-static {v0, v5, v4}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x16

    if-lt v4, v5, :cond_6

    .line 66
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getTraversalBefore()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v5

    invoke-static {v5}, Ll/ܿܶܳ;->ۙ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/util/LinkedHashMap;

    move-result-object v5

    const-string v9, "traversal-before"

    invoke-static {v0, v9, v5}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getTraversalAfter()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v5

    invoke-static {v5}, Ll/ܿܶܳ;->ۙ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/util/LinkedHashMap;

    move-result-object v5

    const-string v9, "traversal-after"

    invoke-static {v0, v9, v5}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    const/16 v5, 0x17

    if-lt v4, v5, :cond_7

    .line 69
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isContextClickable()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v9, "context-clickable"

    invoke-static {v0, v9, v5}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    const/16 v5, 0x18

    if-lt v4, v5, :cond_8

    .line 71
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getDrawingOrder()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v9, "drawing-order"

    invoke-static {v0, v9, v5}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isImportantForAccessibility()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v9, "important-for-accessibility"

    invoke-static {v0, v9, v5}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    const/16 v5, 0x1a

    if-lt v4, v5, :cond_9

    const-string v5, "hint-text"

    .line 75
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getHintText()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-static {v0, v5, v9}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isShowingHintText()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v9, "showing-hint-text"

    invoke-static {v0, v9, v5}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "available-extra-data"

    .line 77
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getAvailableExtraData()Ljava/util/List;

    move-result-object v9

    invoke-static {v0, v5, v9}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_9
    const/16 v5, 0x1c

    if-lt v4, v5, :cond_a

    const-string v5, "pane-title"

    .line 80
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getPaneTitle()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-static {v0, v5, v9}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "tooltip-text"

    .line 81
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getTooltipText()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-static {v0, v5, v9}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 82
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isHeading()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v0, v6, v5}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isScreenReaderFocusable()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "screen-reader-focusable"

    invoke-static {v0, v6, v5}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_a
    const/16 v5, 0x1d

    if-lt v4, v5, :cond_d

    .line 86
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isTextEntryKey()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string v5, "text-entry-key"

    invoke-static {v0, v5, v4}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getTouchDelegateInfo()Landroid/view/accessibility/AccessibilityNodeInfo$TouchDelegateInfo;

    move-result-object v4

    if-nez v4, :cond_b

    const/4 v5, 0x0

    goto :goto_6

    .line 167
    :cond_b
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    .line 168
    :goto_5
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo$TouchDelegateInfo;->getRegionCount()I

    move-result v9

    if-ge v6, v9, :cond_c

    .line 169
    invoke-virtual {v4, v6}, Landroid/view/accessibility/AccessibilityNodeInfo$TouchDelegateInfo;->getRegionAt(I)Landroid/graphics/Region;

    move-result-object v9

    .line 170
    invoke-virtual {v4, v9}, Landroid/view/accessibility/AccessibilityNodeInfo$TouchDelegateInfo;->getTargetForRegion(Landroid/graphics/Region;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v14

    invoke-static {v14}, Ll/ܿܶܳ;->ۙ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/util/LinkedHashMap;

    move-result-object v14

    const/4 v15, 0x2

    new-array v13, v8, [Ljava/lang/Object;

    const-string v17, "region"

    aput-object v17, v13, v12

    aput-object v9, v13, v11

    const-string v9, "target"

    aput-object v9, v13, v15

    aput-object v14, v13, v10

    invoke-static {v13}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    const/16 v13, 0x21

    goto :goto_5

    :cond_c
    :goto_6
    const/4 v4, 0x2

    const-string v6, "touch-delegate-info"

    .line 87
    invoke-static {v0, v6, v5}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_7

    :cond_d
    const/4 v4, 0x2

    .line 89
    :goto_7
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1e

    if-lt v5, v6, :cond_10

    const-string v6, "state-description"

    .line 90
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getStateDescription()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-static {v0, v6, v9}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtraRenderingInfo()Landroid/view/accessibility/AccessibilityNodeInfo$ExtraRenderingInfo;

    move-result-object v6

    if-nez v6, :cond_e

    const/4 v3, 0x0

    goto :goto_9

    .line 160
    :cond_e
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityNodeInfo$ExtraRenderingInfo;->getLayoutSize()Landroid/util/Size;

    move-result-object v9

    if-nez v9, :cond_f

    const/4 v9, 0x0

    goto :goto_8

    .line 161
    :cond_f
    invoke-virtual {v9}, Landroid/util/Size;->getWidth()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-array v14, v8, [Ljava/lang/Object;

    const-string v15, "width"

    aput-object v15, v14, v12

    aput-object v13, v14, v11

    const-string v13, "height"

    aput-object v13, v14, v4

    aput-object v9, v14, v10

    invoke-static {v14}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v9

    .line 162
    :goto_8
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityNodeInfo$ExtraRenderingInfo;->getTextSizeInPx()F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityNodeInfo$ExtraRenderingInfo;->getTextSizeUnit()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v7, v7, [Ljava/lang/Object;

    const-string v14, "layout-size"

    aput-object v14, v7, v12

    aput-object v9, v7, v11

    const-string v9, "text-size-in-px"

    aput-object v9, v7, v4

    aput-object v13, v7, v10

    const-string v9, "text-size-unit"

    aput-object v9, v7, v8

    aput-object v6, v7, v3

    .line 161
    invoke-static {v7}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v3

    :goto_9
    const-string v6, "extra-rendering-info"

    .line 91
    invoke-static {v0, v6, v3}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_10
    const/16 v3, 0x21

    if-lt v5, v3, :cond_11

    const-string v3, "unique-id"

    .line 94
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getUniqueId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v3, v6}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isTextSelectable()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v6, "text-selectable"

    invoke-static {v0, v6, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_11
    const/16 v3, 0x22

    if-lt v5, v3, :cond_12

    .line 98
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInWindow(Landroid/graphics/Rect;)V

    const-string v3, "bounds-in-window"

    .line 99
    invoke-virtual {v2}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v3, v2}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "container-title"

    .line 100
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContainerTitle()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v0, v2, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 101
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isAccessibilityDataSensitive()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "accessibility-data-sensitive"

    invoke-static {v0, v3, v2}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->hasRequestInitialAccessibilityFocus()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "request-initial-accessibility-focus"

    invoke-static {v0, v3, v2}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "min-duration-between-content-changes"

    .line 103
    invoke-static/range {p1 .. p1}, Ll/᩷ۖ᩹;->ۙ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ll/ܿۤۗ;

    move-result-object v3

    invoke-static {v0, v2, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_12
    const/16 v2, 0x23

    if-lt v5, v2, :cond_13

    .line 106
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isGranularScrollingSupported()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "granular-scrolling-supported"

    invoke-static {v0, v3, v2}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_13
    const/16 v2, 0x24

    if-lt v5, v2, :cond_15

    .line 108
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChecked()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "checked-state"

    invoke-static {v0, v5, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 109
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExpandedState()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "expanded-state"

    invoke-static {v0, v5, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFieldRequired()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v5, "field-required"

    invoke-static {v0, v5, v3}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "supplemental-description"

    .line 111
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getSupplementalDescription()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-static {v0, v3, v5}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 113
    invoke-virtual/range {p1 .. p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getLabeledByList()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v6}, Ll/ܿܶܳ;->ۙ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/util/LinkedHashMap;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_14
    const-string v5, "labeled-by-list"

    .line 114
    invoke-static {v0, v5, v3}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    :cond_15
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v2, :cond_18

    if-ge v3, v2, :cond_16

    const v2, 0x186a0

    mul-int v2, v2, v3

    goto :goto_b

    :cond_16
    sget v2, Landroid/os/Build$VERSION;->SDK_INT_FULL:I

    :goto_b
    const v5, 0x36ee81

    if-lt v2, v5, :cond_18

    const-string v2, "getSelection"

    .line 118
    invoke-static {v1, v2}, Ll/ܿܶܳ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_17

    const/4 v2, 0x0

    goto :goto_c

    :cond_17
    const-string v5, "getStart"

    .line 120
    invoke-static {v2, v5}, Ll/ܿܶܳ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ll/ܿܶܳ;->ۙ(Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v5

    const-string v6, "getEnd"

    .line 121
    invoke-static {v2, v6}, Ll/ܿܶܳ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ll/ܿܶܳ;->ۙ(Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v2

    new-array v6, v8, [Ljava/lang/Object;

    const-string v7, "start"

    aput-object v7, v6, v12

    aput-object v5, v6, v11

    const-string v5, "end"

    aput-object v5, v6, v4

    aput-object v2, v6, v10

    .line 119
    invoke-static {v6}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v2

    :goto_c
    const-string v5, "selection"

    invoke-static {v0, v5, v2}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_18
    const/16 v2, 0x25

    if-lt v3, v2, :cond_1a

    const-string v2, "getStructuredDataInfo"

    .line 124
    invoke-static {v1, v2}, Ll/ܿܶܳ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_19

    const/4 v5, 0x0

    goto :goto_d

    :cond_19
    const-string v2, "getTag"

    .line 126
    invoke-static {v1, v2}, Ll/ܿܶܳ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "getAttributes"

    invoke-static {v1, v3}, Ll/ܿܶܳ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    new-array v3, v8, [Ljava/lang/Object;

    const-string v5, "tag"

    aput-object v5, v3, v12

    aput-object v2, v3, v11

    const-string v2, "attributes"

    aput-object v2, v3, v4

    aput-object v1, v3, v10

    .line 125
    invoke-static {v3}, Ll/ܿܶܳ;->ۙ([Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v5

    :goto_d
    const-string v1, "structured-data-info"

    invoke-static {v0, v1, v5}, Ll/ܿܶܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1a
    return-void
.end method

.method public static ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 216
    invoke-static {p0, p1, p2}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 219
    :cond_0
    new-instance v0, Ll/֫᩹ܳ;

    invoke-direct {v0}, Ll/֫᩹ܳ;-><init>()V

    .line 220
    new-instance v1, Landroid/util/JsonWriter;

    invoke-direct {v1, v0}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V

    const-string v2, "  "

    .line 221
    invoke-virtual {v1, v2}, Landroid/util/JsonWriter;->setIndent(Ljava/lang/String;)V

    .line 223
    :try_start_0
    new-instance v2, Ljava/util/IdentityHashMap;

    invoke-direct {v2}, Ljava/util/IdentityHashMap;-><init>()V

    const/4 v3, 0x0

    invoke-static {v1, p2, v2, v3}, Ll/ܿܶܳ;->ۙ(Landroid/util/JsonWriter;Ljava/lang/Object;Ljava/util/IdentityHashMap;I)V
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    invoke-virtual {v1}, Landroid/util/JsonWriter;->flush()V

    .line 230
    invoke-virtual {v0}, Ll/֫᩹ܳ;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Ll/ܺ᩹ܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void

    :catch_0
    move-exception p2

    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to decode accessibility property: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Ll/ܿܶܳ;->᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static ᩷(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    if-nez p2, :cond_0

    const-string p2, ""

    goto :goto_0

    .line 211
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p0, p1, p2}, Ll/ܺ᩹ܳ;->ۙ(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method
