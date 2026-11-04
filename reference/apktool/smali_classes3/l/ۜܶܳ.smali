.class public final Ll/ۜܶܳ;
.super Ljava/lang/Object;
.source "TIY6"


# direct methods
.method public static ۙ(Ljava/lang/String;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 80
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_36

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_9

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "max-text-length"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x25

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "screen-reader-focusable"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x24

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "live-region"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x23

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "editable"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0x22

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "collection-item-info"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0x21

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "text-entry-key"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0x20

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "input-type"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0x1f

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "text-selection-end"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0x1e

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "password"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0x1d

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "multi-line"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0x1c

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "labeled-by-list"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0x1b

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "content-invalid"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0x1a

    goto/16 :goto_0

    :sswitch_c
    const-string v1, "collection-info"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v3, 0x19

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "heading"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v3, 0x18

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "checked"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v3, 0x17

    goto/16 :goto_0

    :sswitch_f
    const-string v1, "showing-hint-text"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v3, 0x16

    goto/16 :goto_0

    :sswitch_10
    const-string v1, "min-duration-between-content-changes"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v3, 0x15

    goto/16 :goto_0

    :sswitch_11
    const-string v1, "structured-data-info"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v3, 0x14

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "field-required"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v3, 0x13

    goto/16 :goto_0

    :sswitch_13
    const-string v1, "can-open-popup"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_14
    const-string v1, "granular-scrolling-supported"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_15
    const-string v1, "window-id"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_16
    const-string v1, "text-selectable"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_17
    const-string v1, "available-extra-data"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_18
    const-string v1, "touch-delegate-info"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_19
    const-string v1, "text-selection-start"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_1a
    const-string v1, "actions"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_1b
    const-string v1, "accessibility-data-sensitive"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_1c
    const-string v1, "movement-granularities"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_1d
    const-string v1, "extras"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_1e
    const-string v1, "dismissable"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1f

    goto :goto_0

    :cond_1f
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_1f
    const-string v1, "extra-rendering-info"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    goto :goto_0

    :cond_20
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_20
    const-string v1, "context-clickable"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_21

    goto :goto_0

    :cond_21
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_21
    const-string v1, "selection"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    goto :goto_0

    :cond_22
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_22
    const-string v1, "range-info"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_23

    goto :goto_0

    :cond_23
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_23
    const-string v1, "expanded-state"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_24

    goto :goto_0

    :cond_24
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_24
    const-string v1, "request-initial-accessibility-focus"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_25

    goto :goto_0

    :cond_25
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_25
    const-string v1, "checked-state"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_26

    goto :goto_0

    :cond_26
    const/4 v3, 0x0

    :goto_0
    const-string p0, "checkable"

    const-string v1, "hint-text"

    const-string v4, "0"

    const-string v5, "true"

    const-string v6, "false"

    packed-switch v3, :pswitch_data_0

    return v2

    .line 43
    :pswitch_0
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_28

    invoke-static {p2}, Ll/ۜܶܳ;->ۙ(Ljava/util/Map;)Z

    move-result p0

    if-eqz p0, :cond_27

    goto :goto_1

    :cond_27
    return v0

    :cond_28
    :goto_1
    return v2

    .line 45
    :pswitch_1
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2a

    invoke-static {p2}, Ll/ۜܶܳ;->ۙ(Ljava/util/Map;)Z

    move-result p0

    if-nez p0, :cond_2a

    const-string p0, "error"

    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll/ۜܶܳ;->ۙ(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_29

    goto :goto_2

    :cond_29
    return v0

    :cond_2a
    :goto_2
    return v2

    .line 47
    :pswitch_2
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2c

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll/ۜܶܳ;->ۙ(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2b

    goto :goto_3

    :cond_2b
    return v0

    :cond_2c
    :goto_3
    return v2

    :pswitch_3
    const-string p0, "PT0S"

    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    goto/16 :goto_7

    .line 28
    :pswitch_4
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2e

    invoke-static {p2}, Ll/ۜܶܳ;->ۙ(Ljava/util/Map;)Z

    move-result p1

    if-nez p1, :cond_2e

    .line 29
    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2d

    goto :goto_4

    :cond_2d
    return v0

    :cond_2e
    :goto_4
    return v2

    .line 26
    :pswitch_5
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_30

    const-string p0, "scrollable"

    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2f

    goto :goto_5

    :cond_2f
    return v0

    :cond_30
    :goto_5
    return v2

    .line 14
    :pswitch_6
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_32

    invoke-static {p2}, Ll/ۜܶܳ;->ۙ(Ljava/util/Map;)Z

    move-result p0

    if-nez p0, :cond_32

    const-string p0, "text"

    .line 15
    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll/ۜܶܳ;->ۙ(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_32

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll/ۜܶܳ;->ۙ(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_31

    goto :goto_6

    :cond_31
    return v0

    :cond_32
    :goto_6
    return v2

    :pswitch_7
    const-string p0, "-1"

    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_7

    .line 33
    :pswitch_8
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_7

    :pswitch_9
    const-string p0, "[]"

    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_33

    const-string p0, "{}"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_33

    const-string p0, "null"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_33

    return v2

    :cond_33
    return v0

    .line 53
    :pswitch_a
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_7

    .line 24
    :pswitch_b
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    :goto_7
    xor-int/2addr p0, v2

    return p0

    .line 50
    :pswitch_c
    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_35

    .line 51
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_34

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_34

    goto :goto_8

    :cond_34
    return v0

    :cond_35
    :goto_8
    return v2

    :cond_36
    :goto_9
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ad2f115 -> :sswitch_25
        -0x79b4eaae -> :sswitch_24
        -0x724fa983 -> :sswitch_23
        -0x6ef574c2 -> :sswitch_22
        -0x66478e74 -> :sswitch_21
        -0x62e29fbc -> :sswitch_20
        -0x5d67b154 -> :sswitch_1f
        -0x51bf0d1c -> :sswitch_1e
        -0x4cd5119d -> :sswitch_1d
        -0x4ca1ca32 -> :sswitch_1c
        -0x464d856e -> :sswitch_1b
        -0x453fb703 -> :sswitch_1a
        -0x3d56c3bf -> :sswitch_19
        -0x34737618 -> :sswitch_18
        -0x3341ff35 -> :sswitch_17
        -0x18a3fb0a -> :sswitch_16
        -0xcefebe8 -> :sswitch_15
        -0x208a717 -> :sswitch_14
        0x6a83586 -> :sswitch_13
        0x10f68712 -> :sswitch_12
        0x13f28375 -> :sswitch_11
        0x24f1348c -> :sswitch_10
        0x2984b4ab -> :sswitch_f
        0x2c3ecfa7 -> :sswitch_e
        0x2f677e02 -> :sswitch_d
        0x3c704a7d -> :sswitch_c
        0x440080a3 -> :sswitch_b
        0x44e8231a -> :sswitch_a
        0x47b75808 -> :sswitch_9
        0x4889ba9b -> :sswitch_8
        0x4aca6c7a -> :sswitch_7
        0x4fe6a75d -> :sswitch_6
        0x595be5e4 -> :sswitch_5
        0x5f1e62b9 -> :sswitch_4
        0x5f82ee64 -> :sswitch_3
        0x6abd3ef5 -> :sswitch_2
        0x7166cce9 -> :sswitch_1
        0x7458649d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_b
        :pswitch_9
        :pswitch_b
        :pswitch_9
        :pswitch_8
        :pswitch_b
        :pswitch_9
        :pswitch_7
        :pswitch_9
        :pswitch_9
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_b
        :pswitch_4
        :pswitch_9
        :pswitch_3
        :pswitch_2
        :pswitch_c
        :pswitch_b
        :pswitch_9
        :pswitch_1
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_8
        :pswitch_b
        :pswitch_9
        :pswitch_6
        :pswitch_8
        :pswitch_b
        :pswitch_7
    .end packed-switch
.end method

.method public static ۙ(Ljava/util/Map;)Z
    .locals 3

    const-string v0, "input-type"

    .line 73
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "max-text-length"

    .line 74
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "editable"

    .line 75
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string v2, "true"

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 76
    invoke-static {v0}, Ll/ۜܶܳ;->ۙ(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "0"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 77
    :cond_0
    invoke-static {v1}, Ll/ۜܶܳ;->ۙ(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "-1"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
