.class public final Ll/֨ܺ᩻;
.super Ljava/lang/Object;
.source "Z6OZ"


# instance fields
.field public final ۙ:[Z

.field public final ۤ:[Z

.field public final ۫:[Z

.field public final ܳ:[Z

.field public final ᩴ:[I

.field public final ᩷:[Z

.field public final ᩸:[Z


# direct methods
.method public constructor <init>(Ll/۟ܺۨ;ILl/ۙܽ᩻;)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 20
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-array v2, v1, [Z

    iput-object v2, v0, Ll/֨ܺ᩻;->۫:[Z

    .line 22
    new-array v2, v1, [Z

    iput-object v2, v0, Ll/֨ܺ᩻;->ܳ:[Z

    .line 23
    new-array v2, v1, [I

    iput-object v2, v0, Ll/֨ܺ᩻;->ᩴ:[I

    .line 24
    new-array v2, v1, [Z

    iput-object v2, v0, Ll/֨ܺ᩻;->᩷:[Z

    .line 25
    new-array v2, v1, [Z

    iput-object v2, v0, Ll/֨ܺ᩻;->ۤ:[Z

    .line 26
    new-array v2, v1, [Z

    iput-object v2, v0, Ll/֨ܺ᩻;->᩸:[Z

    .line 27
    new-array v1, v1, [Z

    iput-object v1, v0, Ll/֨ܺ᩻;->ۙ:[Z

    .line 28
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    move-object/from16 v2, p1

    .line 29
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 30
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_25

    .line 31
    invoke-virtual/range {p3 .. p3}, Ll/ۙܽ᩻;->ۙ()V

    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ܺۨ;

    .line 33
    invoke-virtual {v2}, Ll/ۖܺۨ;->᩷()I

    move-result v3

    const/4 v4, 0x5

    const/4 v5, 0x1

    if-eq v3, v4, :cond_1

    const/16 v4, 0x43

    if-ne v3, v4, :cond_2

    .line 35
    :cond_1
    iget-object v4, v0, Ll/֨ܺ᩻;->ۤ:[Z

    iget-object v6, v2, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    invoke-interface {v6}, Ll/۠ܺۨ;->ۤ()I

    move-result v6

    aput-boolean v5, v4, v6

    :cond_2
    const/16 v4, 0xa2

    if-eq v3, v4, :cond_24

    const/16 v4, 0xa7

    if-ne v3, v4, :cond_3

    goto/16 :goto_11

    :cond_3
    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 41
    :goto_1
    invoke-virtual {v2}, Ll/۟ܺۨ;->getChildCount()I

    move-result v6

    if-ge v4, v6, :cond_0

    .line 42
    invoke-virtual {v2, v4}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v6

    .line 43
    instance-of v7, v6, Ll/۟ܺۨ;

    if-eqz v7, :cond_4

    check-cast v6, Ll/۟ܺۨ;

    .line 44
    invoke-virtual {v1, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto/16 :goto_10

    .line 45
    :cond_4
    instance-of v7, v6, Ll/֨᩹ۨ;

    if-eqz v7, :cond_23

    check-cast v6, Ll/֨᩹ۨ;

    .line 46
    invoke-interface {v6}, Ll/֨᩹ۨ;->ۙ()Ll/۠ܺۨ;

    move-result-object v6

    .line 53
    iget-object v7, v0, Ll/֨ܺ᩻;->۫:[Z

    iget-object v8, v0, Ll/֨ܺ᩻;->ܳ:[Z

    invoke-interface {v6}, Ll/۠ܺۨ;->ۤ()I

    move-result v9

    .line 54
    invoke-virtual {v2}, Ll/ۖܺۨ;->᩷()I

    move-result v10

    .line 55
    invoke-interface {v6}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v11

    .line 56
    iget-object v12, v0, Ll/֨ܺ᩻;->ۙ:[Z

    const/16 v13, 0x37

    if-eq v10, v13, :cond_5

    const/16 v13, 0x38

    if-eq v10, v13, :cond_5

    packed-switch v10, :pswitch_data_0

    goto :goto_2

    .line 59
    :cond_5
    :pswitch_0
    iget-object v13, v2, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    invoke-interface {v13}, Ll/۠ܺۨ;->ۤ()I

    move-result v13

    if-ne v9, v13, :cond_6

    const/4 v13, 0x1

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v13, 0x0

    .line 60
    :goto_3
    aput-boolean v13, v12, v9

    .line 63
    invoke-interface {v6}, Ll/۠ܺۨ;->getType()I

    move-result v6

    const/16 v12, 0x14

    if-ne v6, v12, :cond_8

    .line 64
    iget-object v6, v0, Ll/֨ܺ᩻;->᩸:[Z

    const/16 v12, 0x1b

    if-eq v10, v12, :cond_7

    const/16 v12, 0x1c

    if-eq v10, v12, :cond_7

    const/16 v12, 0x59

    if-eq v10, v12, :cond_7

    const/16 v12, 0x5a

    if-eq v10, v12, :cond_7

    const/16 v12, 0x5d

    if-eq v10, v12, :cond_7

    const/16 v12, 0x5e

    if-eq v10, v12, :cond_7

    const/16 v12, 0x67

    if-eq v10, v12, :cond_7

    const/16 v12, 0x71

    if-eq v10, v12, :cond_7

    const/16 v12, 0x8e

    if-eq v10, v12, :cond_7

    const/16 v12, 0xab

    if-eq v10, v12, :cond_7

    const/16 v12, 0xae

    if-eq v10, v12, :cond_7

    const/16 v12, 0xc6

    if-eq v10, v12, :cond_7

    const/16 v12, 0xbe

    if-eq v10, v12, :cond_7

    const/16 v12, 0xbf

    if-eq v10, v12, :cond_7

    packed-switch v10, :pswitch_data_1

    packed-switch v10, :pswitch_data_2

    packed-switch v10, :pswitch_data_3

    packed-switch v10, :pswitch_data_4

    const/4 v12, 0x0

    goto :goto_4

    :cond_7
    :pswitch_1
    const/4 v12, 0x1

    .line 78
    :goto_4
    aput-boolean v12, v6, v9

    .line 82
    :cond_8
    iget-object v6, v0, Ll/֨ܺ᩻;->᩷:[Z

    const/16 v12, 0x6d

    const-string v13, "if"

    const/16 v14, 0x8b

    if-eq v10, v12, :cond_c

    if-eq v10, v14, :cond_b

    const/16 v12, 0xb2

    if-eq v10, v12, :cond_9

    const/16 v12, 0x75

    if-eq v10, v12, :cond_b

    const/16 v12, 0x76

    if-eq v10, v12, :cond_b

    packed-switch v10, :pswitch_data_5

    goto :goto_5

    :cond_9
    const-string v12, "async"

    .line 93
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_e

    const-string v15, "for"

    .line 94
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    iget-object v15, v2, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    invoke-interface {v15}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    :cond_a
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    goto :goto_6

    .line 92
    :cond_b
    :pswitch_2
    iget-object v12, v2, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    invoke-interface {v12}, Ll/۠ܺۨ;->ۤ()I

    move-result v12

    if-eq v9, v12, :cond_e

    invoke-virtual {v2, v3}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v12

    instance-of v12, v12, Ll/۟ܺۨ;

    if-eqz v12, :cond_d

    goto :goto_6

    .line 95
    :cond_c
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    const-string v12, "else"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    goto :goto_6

    :cond_d
    :goto_5
    const/4 v12, 0x0

    goto :goto_7

    :cond_e
    :goto_6
    const/4 v12, 0x1

    .line 96
    :goto_7
    aput-boolean v12, v6, v9

    const-string v6, "+"

    .line 98
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    const-string v6, "-"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    const-string v6, "~"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    :cond_f
    const/16 v6, 0x8a

    if-ne v10, v6, :cond_10

    .line 99
    aput-boolean v5, v8, v9

    goto/16 :goto_10

    :cond_10
    const-string v6, "*"

    .line 100
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    const/16 v13, 0x3f

    if-nez v12, :cond_11

    const-string v12, "**"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_12

    :cond_11
    const/16 v12, 0x89

    if-eq v10, v12, :cond_12

    if-eq v10, v14, :cond_12

    if-eq v10, v13, :cond_12

    .line 102
    aput-boolean v5, v8, v9

    goto/16 :goto_10

    .line 103
    :cond_12
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    if-ne v10, v13, :cond_13

    .line 104
    aput-boolean v5, v7, v9

    goto/16 :goto_10

    :cond_13
    const-string v6, "@"

    .line 105
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    const/16 v6, 0x22

    if-ne v10, v6, :cond_14

    .line 106
    aput-boolean v5, v8, v9

    goto/16 :goto_10

    :cond_14
    const-string v6, ":"

    .line 107
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    const/16 v6, 0x8f

    if-ne v10, v6, :cond_15

    .line 108
    aput-boolean v5, v7, v9

    .line 109
    aput-boolean v5, v8, v9

    goto/16 :goto_10

    :cond_15
    const-string v6, "="

    .line 110
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    const/16 v6, 0xbb

    if-eq v10, v6, :cond_17

    const/16 v6, 0xbc

    if-eq v10, v6, :cond_17

    const/16 v6, 0x64

    if-ne v10, v6, :cond_16

    goto :goto_8

    :cond_16
    const/4 v6, 0x0

    goto :goto_9

    :cond_17
    :goto_8
    const/4 v6, 0x1

    :goto_9
    const/16 v11, 0x35

    if-ne v10, v11, :cond_1a

    .line 115
    iget-object v6, v2, Ll/ۖܺۨ;->᩷:Ll/۟ܺۨ;

    .line 116
    invoke-virtual {v6, v3}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object v6

    .line 118
    instance-of v10, v6, Ll/۬ۗ᩻;

    if-eqz v10, :cond_19

    check-cast v6, Ll/۬ۗ᩻;

    .line 3619
    const-class v10, Ll/ܽܽ᩻;

    invoke-virtual {v6, v10, v3}, Ll/۟ܺۨ;->ۙ(Ljava/lang/Class;I)Ll/۟ܺۨ;

    move-result-object v6

    check-cast v6, Ll/ܽܽ᩻;

    if-nez v6, :cond_18

    goto :goto_a

    :cond_18
    const/4 v6, 0x0

    goto :goto_b

    :cond_19
    :goto_a
    const/4 v6, 0x1

    .line 120
    :cond_1a
    :goto_b
    aput-boolean v6, v7, v9

    .line 121
    aput-boolean v6, v8, v9

    goto/16 :goto_10

    :cond_1b
    const-string v6, "/"

    .line 122
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    const/16 v6, 0x29

    if-eq v10, v6, :cond_1c

    const/16 v6, 0x2a

    if-eq v10, v6, :cond_1c

    const/16 v6, 0x95

    if-eq v10, v6, :cond_1c

    const/16 v6, 0x96

    if-ne v10, v6, :cond_1d

    .line 125
    :cond_1c
    aput-boolean v5, v8, v9

    goto :goto_10

    :cond_1d
    const-string v6, "("

    .line 126
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1e

    const-string v6, "["

    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    :cond_1e
    const/16 v6, 0xc5

    const/16 v8, 0x8d

    if-eq v10, v8, :cond_20

    if-eq v10, v6, :cond_20

    const/16 v11, 0x26

    if-eq v10, v11, :cond_20

    const/16 v11, 0x24

    if-eq v10, v11, :cond_20

    const/16 v11, 0x61

    if-eq v10, v11, :cond_20

    const/16 v11, 0x66

    if-eq v10, v11, :cond_20

    const/16 v11, 0xc1

    if-eq v10, v11, :cond_20

    const/16 v11, 0xc4

    if-ne v10, v11, :cond_1f

    goto :goto_c

    :cond_1f
    const/4 v11, 0x0

    goto :goto_d

    :cond_20
    :goto_c
    const/4 v11, 0x1

    .line 127
    :goto_d
    aput-boolean v11, v7, v9

    const/16 v11, 0xb5

    if-ne v10, v11, :cond_23

    .line 115
    iget-object v10, v2, Ll/ۖܺۨ;->᩷:Ll/۟ܺۨ;

    .line 133
    invoke-virtual {v10}, Ll/ۖܺۨ;->᩷()I

    move-result v10

    if-eq v10, v8, :cond_22

    if-ne v10, v6, :cond_21

    goto :goto_e

    :cond_21
    const/4 v6, 0x0

    goto :goto_f

    :cond_22
    :goto_e
    const/4 v6, 0x1

    .line 134
    :goto_f
    aput-boolean v6, v7, v9

    :cond_23
    :goto_10
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    .line 38
    :cond_24
    :goto_11
    iget-object v3, v0, Ll/֨ܺ᩻;->ᩴ:[I

    iget-object v4, v2, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    invoke-interface {v4}, Ll/۠ܺۨ;->ۤ()I

    move-result v4

    iget-object v2, v2, Ll/۟ܺۨ;->ᩴ:Ll/۠ܺۨ;

    invoke-interface {v2}, Ll/۠ܺۨ;->ۤ()I

    move-result v2

    aput v2, v3, v4

    goto/16 :goto_0

    :cond_25
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3e
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x29
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2d
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x61
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0xb7
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x7a
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
