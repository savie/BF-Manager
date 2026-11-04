.class public final Ll/ۙ᩹ܳ;
.super Ljava/lang/Object;
.source "1IX2"


# static fields
.field public static final ۙ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 76

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۙ᩹ܳ;->ۙ:Ljava/util/HashMap;

    const-string v74, "structured-data-info"

    const-string v75, "extras"

    const-string v1, "package"

    const-string v2, "class"

    const-string v3, "resource-id"

    const-string v4, "resource-id-hex"

    const-string v5, "unique-id"

    const-string v6, "text"

    const-string v7, "hint-text"

    const-string v8, "showing-hint-text"

    const-string v9, "content-desc"

    const-string v10, "supplemental-description"

    const-string v11, "state-description"

    const-string v12, "tooltip-text"

    const-string v13, "pane-title"

    const-string v14, "container-title"

    const-string v15, "width"

    const-string v16, "height"

    const-string v17, "position"

    const-string v18, "bounds"

    const-string v19, "position-in-parent"

    const-string v20, "bounds-in-parent"

    const-string v21, "index"

    const-string v22, "window-id"

    const-string v23, "child-count"

    const-string v24, "bounds-in-window"

    const-string v25, "drawing-order"

    const-string v26, "visible-to-user"

    const-string v27, "enabled"

    const-string v28, "selected"

    const-string v29, "focusable"

    const-string v30, "focused"

    const-string v31, "accessibility-focused"

    const-string v32, "checkable"

    const-string v33, "checked"

    const-string v34, "checked-state"

    const-string v35, "expanded-state"

    const-string v36, "range-info"

    const-string v37, "clickable"

    const-string v38, "long-clickable"

    const-string v39, "context-clickable"

    const-string v40, "can-open-popup"

    const-string v41, "dismissable"

    const-string v42, "scrollable"

    const-string v43, "granular-scrolling-supported"

    const-string v44, "editable"

    const-string v45, "input-type"

    const-string v46, "password"

    const-string v47, "multi-line"

    const-string v48, "max-text-length"

    const-string v49, "text-selectable"

    const-string v50, "text-entry-key"

    const-string v51, "movement-granularities"

    const-string v52, "text-selection-start"

    const-string v53, "text-selection-end"

    const-string v54, "selection"

    const-string v55, "field-required"

    const-string v56, "content-invalid"

    const-string v57, "error"

    const-string v58, "collection-info"

    const-string v59, "collection-item-info"

    const-string v60, "important-for-accessibility"

    const-string v61, "screen-reader-focusable"

    const-string v62, "request-initial-accessibility-focus"

    const-string v63, "heading"

    const-string v64, "live-region"

    const-string v65, "min-duration-between-content-changes"

    const-string v66, "accessibility-data-sensitive"

    const-string v67, "label-for"

    const-string v68, "labeled-by"

    const-string v69, "labeled-by-list"

    const-string v70, "traversal-before"

    const-string v71, "traversal-after"

    const-string v72, "touch-delegate-info"

    const-string v73, "extra-rendering-info"

    .line 18
    filled-new-array/range {v1 .. v75}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x4b

    if-ge v1, v2, :cond_0

    .line 44
    sget-object v2, Ll/ۙ᩹ܳ;->ۙ:Ljava/util/HashMap;

    aget-object v3, v0, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 45
    :cond_0
    sget-object v0, Ll/ۙ᩹ܳ;->ۙ:Ljava/util/HashMap;

    const-string v1, "available-extra-data"

    const v2, 0x7fffffff

    const v3, 0x7ffffffe

    const-string v4, "actions"

    .line 0
    invoke-static {v3, v0, v4, v2, v1}, Ll/֨᩵ᩴ;->ۙ(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static ۙ(Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I
    .locals 2

    .line 78
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 83
    sget-object v0, Ll/ۙ᩹ܳ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    const v1, 0x7ffffffd

    if-nez p0, :cond_0

    const p0, 0x7ffffffd

    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    .line 78
    :goto_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 83
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_1

    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 78
    :goto_1
    invoke-static {p0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method

.method public static ۙ(JFLjava/text/DecimalFormat;)Ljava/lang/String;
    .locals 3

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "px / "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    long-to-double p0, p0

    float-to-double v1, p2

    div-double/2addr p0, v1

    invoke-virtual {p3, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "dp"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ([IFLjava/text/DecimalFormat;)Ljava/lang/String;
    .locals 7

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    aget v2, p0, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "px, "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    aget v3, p0, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "px] / ["

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v1, p0, v1

    int-to-double v3, v1

    float-to-double v5, p1

    div-double/2addr v3, v5

    .line 97
    invoke-virtual {p2, v3, v4}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "dp, "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget p0, p0, v2

    int-to-double p0, p0

    div-double/2addr p0, v5

    .line 98
    invoke-virtual {p2, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "dp]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/util/Map;ZFLjava/lang/String;)Ljava/util/ArrayList;
    .locals 17

    move/from16 v0, p2

    move-object/from16 v1, p3

    .line 51
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 52
    new-instance v3, Ljava/text/DecimalFormat;

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v4}, Ljava/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DecimalFormatSymbols;

    move-result-object v4

    const-string v5, "0.##"

    invoke-direct {v3, v5, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 53
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 54
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 55
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    move-object/from16 v8, p0

    if-nez p1, :cond_0

    .line 56
    invoke-static {v6, v7, v8}, Ll/ۜܶܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z

    move-result v9

    if-nez v9, :cond_0

    goto :goto_0

    :cond_0
    const-string v9, "bounds"

    .line 57
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1

    const-string v10, "bounds-in-parent"

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    :cond_1
    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v7, :cond_4

    const-string v12, "["

    .line 102
    invoke-virtual {v7, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    const-string v12, "]"

    invoke-virtual {v7, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_2

    goto :goto_1

    :cond_2
    const/16 v12, 0x2c

    .line 103
    invoke-virtual {v7, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v13

    const-string v14, "]["

    .line 104
    invoke-virtual {v7, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v14

    add-int/lit8 v15, v14, 0x2

    .line 105
    invoke-virtual {v7, v12, v15}, Ljava/lang/String;->indexOf(II)I

    move-result v12

    if-lt v13, v10, :cond_4

    if-le v14, v13, :cond_4

    if-gt v12, v15, :cond_3

    goto :goto_1

    .line 108
    :cond_3
    :try_start_0
    invoke-virtual {v7, v10, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v16, 0x1

    :try_start_1
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    add-int/lit8 v13, v13, 0x1

    .line 109
    invoke-virtual {v7, v13, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v13

    .line 110
    invoke-virtual {v7, v15, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    add-int/lit8 v12, v12, 0x1

    .line 111
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v15

    add-int/lit8 v15, v15, -0x1

    invoke-virtual {v7, v12, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    filled-new-array {v10, v13, v14, v7}, [I

    move-result-object v11
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    nop

    goto :goto_2

    :catch_1
    :cond_4
    :goto_1
    const/16 v16, 0x1

    :goto_2
    if-eqz v11, :cond_6

    .line 60
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x2

    .line 62
    aget v5, v11, v5

    int-to-long v5, v5

    const/4 v7, 0x0

    aget v7, v11, v7

    int-to-long v9, v7

    sub-long/2addr v5, v9

    .line 63
    invoke-static {v5, v6, v0, v3}, Ll/ۙ᩹ܳ;->ۙ(JFLjava/text/DecimalFormat;)Ljava/lang/String;

    move-result-object v5

    .line 88
    new-instance v6, Ljava/util/AbstractMap$SimpleImmutableEntry;

    const-string v7, "width"

    invoke-direct {v6, v7, v5}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x3

    .line 64
    aget v5, v11, v5

    int-to-long v5, v5

    aget v7, v11, v16

    int-to-long v9, v7

    sub-long/2addr v5, v9

    .line 65
    invoke-static {v5, v6, v0, v3}, Ll/ۙ᩹ܳ;->ۙ(JFLjava/text/DecimalFormat;)Ljava/lang/String;

    move-result-object v5

    .line 88
    new-instance v6, Ljava/util/AbstractMap$SimpleImmutableEntry;

    const-string v7, "height"

    invoke-direct {v6, v7, v5}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    invoke-static {v11, v0, v3}, Ll/ۙ᩹ܳ;->ۙ([IFLjava/text/DecimalFormat;)Ljava/lang/String;

    move-result-object v5

    .line 88
    new-instance v6, Ljava/util/AbstractMap$SimpleImmutableEntry;

    const-string v7, "position"

    invoke-direct {v6, v7, v5}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    .line 68
    :cond_5
    invoke-static {v11, v0, v3}, Ll/ۙ᩹ܳ;->ۙ([IFLjava/text/DecimalFormat;)Ljava/lang/String;

    move-result-object v5

    .line 88
    new-instance v6, Ljava/util/AbstractMap$SimpleImmutableEntry;

    const-string v7, "position-in-parent"

    invoke-direct {v6, v7, v5}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 74
    :cond_6
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    if-eqz v1, :cond_8

    .line 88
    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    const-string v3, "resource-id-hex"

    invoke-direct {v0, v3, v1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    :cond_8
    new-instance v0, Ll/۬ܶܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v2
.end method
