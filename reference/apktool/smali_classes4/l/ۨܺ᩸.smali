.class public final Ll/ۨܺ᩸;
.super Ljava/lang/Object;
.source "MAK5"


# static fields
.field public static ۙ:Ljava/lang/String; = ""

.field public static volatile ۤ:Z = false

.field private static final ᩶ᩳ᩹:[S

.field public static ᩷:Ljava/lang/String; = ""


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨܺ᩸;->᩶ᩳ᩹:[S

    return-void

    :array_0
    .array-data 2
        0xff9s
        0x33das
        0x33d8s
        0x33c9s
        0x33fes
        0x33d1s
        0x33dcs
        0x33ces
        0x33ces
        0x33f3s
        0x33dcs
        0x33d0s
        0x33d8s
        0x33das
        0x33d8s
        0x33c9s
        0x33f0s
        0x33d8s
        0x33c9s
        0x33d5s
        0x33d2s
        0x33d9s
        0x33f3s
        0x33dcs
        0x33d0s
        0x33d8s
    .end array-data
.end method

.method public static synthetic ۙ()Ljava/lang/String;
    .locals 1

    .line 50
    sget-object v0, Ll/ۨܺ᩸;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 62
    sget-boolean v0, Ll/ۨܺ᩸;->ۤ:Z

    if-nez v0, :cond_0

    return-void

    .line 65
    :cond_0
    sput-object p0, Ll/ۨܺ᩸;->ۙ:Ljava/lang/String;

    .line 66
    sput-object p1, Ll/ۨܺ᩸;->᩷:Ljava/lang/String;

    return-void
.end method

.method public static ۤ()V
    .locals 22

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, -0x2c451d33

    sget v16, Ll/ۗ֨;->᩹ۜۡ:I

    sget v17, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v18, "\u06db\u05a1"

    invoke-static/range {v18 .. v18}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v17

    mul-int/lit8 v18, v18, 0x29

    xor-int v0, v18, v16

    mul-int/lit16 v0, v0, -0x62c7

    const v20, 0x4456e96d

    xor-int v0, v0, v20

    const v20, -0x27145334

    xor-int v18, v18, v20

    move-object v6, v5

    move-object v12, v11

    move-object v14, v13

    move/from16 v19, v18

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const v18, -0x2c451d33

    const/16 v21, 0x0

    move-object v5, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v8, v18, v16

    mul-int/lit16 v8, v8, -0x28e9

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v0, v8

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    add-int v0, v10, v10

    sub-int/2addr v0, v9

    if-gez v0, :cond_8

    const-string v0, "\u1a79\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, -0x22a7

    const v19, 0x643ca9a3

    xor-int v8, v8, v19

    const v19, -0x5ead09e7

    goto/16 :goto_6

    :sswitch_0
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    sget v0, Ll/ۧ;->ۨۗܰ:I

    if-gez v0, :cond_0

    goto/16 :goto_2

    :sswitch_1
    sget v0, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v0, :cond_b

    goto/16 :goto_2

    .line 50
    :sswitch_2
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget v0, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v0, :cond_5

    goto/16 :goto_5

    .line 53
    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto/16 :goto_5

    .line 52
    :sswitch_4
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    return-void

    .line 53
    :sswitch_5
    invoke-virtual {v1, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 54
    new-instance v1, Ll/᩵ܺ᩸;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Lorg/lsposed/lsplant/Hooker;->ۙ(Ljava/lang/reflect/Method;Ll/᩹ۡۛ;)V

    return-void

    :sswitch_6
    const/16 v0, 0xd

    .line 50
    invoke-static {v14, v15, v0, v11}, Ll/֫֡;->ܺۜᩴ([SIII)Ljava/lang/String;

    move-result-object v6

    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v0, :cond_1

    :cond_0
    const-string v0, "\u06d8\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v8, v0, v16

    mul-int/lit16 v8, v8, 0xe67

    const v19, 0x1ad8321c

    xor-int v8, v8, v19

    const v19, 0x67ea48f2

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u06e2\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x47

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, -0x2645

    const v19, -0x45d17930

    xor-int v8, v8, v19

    const v19, 0x65fafe6c

    goto/16 :goto_6

    :sswitch_7
    invoke-static {v5, v4}, Lorg/lsposed/lsplant/Hooker;->ۙ(Ljava/lang/reflect/Method;Ll/᩹ۡۛ;)V

    sget-object v14, Ll/ۨܺ᩸;->᩶ᩳ᩹:[S

    const/16 v15, 0xd

    .line 51
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v0, "\u06dc\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v8, v0, v16

    mul-int/lit16 v8, v8, 0x1033

    const v19, 0x6d2b10bc

    xor-int v8, v8, v19

    const v19, 0x48cf5554    # 424618.62f

    goto/16 :goto_6

    :sswitch_8
    const/4 v3, 0x0

    .line 49
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 50
    new-instance v4, Ll/ۗܺ᩸;

    .line 51
    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_3

    goto :goto_1

    .line 50
    :cond_3
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-boolean v0, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v0, :cond_4

    :goto_1
    const-string v0, "\u05ab\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x3d

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x124d

    const v8, 0x7e199c0

    xor-int/2addr v4, v8

    const v8, 0x3774fc09

    xor-int v19, v0, v8

    move v0, v4

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u1a77\u073d"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v8, v0, v16

    mul-int/lit16 v8, v8, -0x3a61

    const v19, 0x3d3d7534

    xor-int v8, v8, v19

    const v19, -0x663bab85    # -2.0300046E-23f

    goto/16 :goto_6

    :sswitch_9
    const/16 v0, 0xc

    .line 49
    invoke-static {v12, v13, v0, v11}, Ll/֫ۢ;->۬ۡ۠([SIII)Ljava/lang/String;

    move-result-object v2

    .line 53
    sget-boolean v0, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v0, :cond_6

    :cond_5
    :goto_2
    const-string v0, "\u1a7a\u0736"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, -0x1ff5

    const v19, -0x6fa8051b

    xor-int v8, v8, v19

    const v19, -0x3a003a3c

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u06db\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, 0x391b

    const v19, -0x697ea780

    xor-int v8, v8, v19

    const v19, 0x29d61ea7

    goto/16 :goto_6

    .line 49
    :sswitch_a
    const-class v1, Ljava/lang/StackTraceElement;

    sget-object v12, Ll/ۨܺ᩸;->᩶ᩳ᩹:[S

    const/4 v13, 0x1

    .line 51
    sget v0, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v0, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u06d9\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x7f

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, -0x29d7

    const v19, -0x34294d8a    # -2.814078E7f

    xor-int v8, v8, v19

    const v19, 0x5600fed9

    goto/16 :goto_6

    :sswitch_b
    const/16 v0, 0x1f8b

    const/16 v11, 0x1f8b

    goto :goto_3

    :sswitch_c
    const/16 v0, 0x33bd

    const/16 v11, 0x33bd

    :goto_3
    const-string v0, "\u06e7\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v8, v0, v16

    mul-int/lit16 v8, v8, -0x1a37

    const v19, 0x75bb37b0

    xor-int v8, v8, v19

    const v19, -0x61f20f8b

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u06e7\u05a8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v8, v0, v16

    mul-int/lit16 v8, v8, 0x2087

    const v19, -0x5dea19dc

    xor-int v8, v8, v19

    const v19, 0x31c31f7

    goto/16 :goto_6

    :sswitch_d
    mul-int v0, v7, v7

    const v8, 0x344b369

    add-int v10, v0, v8

    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_9

    goto :goto_4

    :cond_9
    const-string v0, "\u1a74\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x13

    xor-int v8, v0, v16

    mul-int/lit16 v8, v8, -0x1d6f

    const v19, 0x28733cce

    xor-int v8, v8, v19

    const v19, 0x4a0c4877    # 2298397.8f

    goto/16 :goto_6

    :sswitch_e
    add-int v0, v7, v21

    mul-int v9, v0, v0

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_4

    :cond_a
    const-string v0, "\u06d8\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, -0xd41

    const v19, -0x3ec527f4

    xor-int v8, v8, v19

    const v19, -0x52a0688b

    goto :goto_6

    :sswitch_f
    const/16 v21, 0x1ced

    sget v0, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v0, :cond_c

    :cond_b
    :goto_4
    const-string v0, "\u1a79\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, -0x3abf

    const v19, -0x13d52179

    xor-int v8, v8, v19

    const v19, -0x1878392a

    goto :goto_6

    :cond_c
    const-string v0, "\u06e0\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v8, v0, v16

    mul-int/lit16 v8, v8, 0x1227

    const v19, 0x2e873cd6

    xor-int v8, v8, v19

    const v19, 0x2b888415    # 9.700041E-13f

    goto :goto_6

    :sswitch_10
    sget-object v0, Ll/ۨܺ᩸;->᩶ᩳ᩹:[S

    const/4 v7, 0x0

    aget-short v7, v0, v7

    .line 50
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_d

    :goto_5
    const-string v0, "\u1a75\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v8, v0, v16

    mul-int/lit16 v8, v8, 0x4051

    const v19, -0x754d7ce2

    xor-int v8, v8, v19

    const v19, -0x2def462d

    goto :goto_6

    :cond_d
    const-string v0, "\u073a\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v8, v0, v17

    mul-int/lit16 v8, v8, -0x5169

    const v19, 0x1fa7d36b

    xor-int v8, v8, v19

    const v19, 0x7a082346

    :goto_6
    xor-int v19, v0, v19

    move v0, v8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77d520f9 -> :sswitch_5
        -0x6febd142 -> :sswitch_f
        -0x6c831c3a -> :sswitch_c
        -0x69ae2f09 -> :sswitch_7
        -0x636e45ea -> :sswitch_6
        -0x51c238d4 -> :sswitch_0
        -0x4d2a43e1 -> :sswitch_9
        -0x4417ae7f -> :sswitch_e
        -0x3c35ccf2 -> :sswitch_8
        -0x38902b16 -> :sswitch_10
        -0x34941472 -> :sswitch_5
        -0x275078b5 -> :sswitch_6
        -0x259c1773 -> :sswitch_8
        -0x10ed8081 -> :sswitch_0
        -0xa888c5f -> :sswitch_3
        -0x9dec2d9 -> :sswitch_e
        -0x875674f -> :sswitch_1
        -0x8db644 -> :sswitch_1
        0x9a7664d -> :sswitch_7
        0xa0eb48d -> :sswitch_f
        0xd980a2c -> :sswitch_2
        0xe5e6612 -> :sswitch_b
        0xe6d24dd -> :sswitch_a
        0x1eeaa2d7 -> :sswitch_d
        0x2c556895 -> :sswitch_10
        0x2d478791 -> :sswitch_c
        0x2fe009bc -> :sswitch_3
        0x42738b45 -> :sswitch_4
        0x46436541 -> :sswitch_2
        0x4743bb94 -> :sswitch_d
        0x4b4d4e86 -> :sswitch_b
        0x6817eae1 -> :sswitch_a
        0x75f07665 -> :sswitch_9
        0x7b70d2e9 -> :sswitch_4
    .end sparse-switch
.end method

.method public static declared-synchronized ᩴ()V
    .locals 6

    .line 2
    const-class v0, Ll/ۨܺ᩸;

    .line 3
    monitor-enter v0

    .line 19
    :try_start_0
    invoke-static {}, Ll/ۨܺ᩸;->᩸()V

    const-string v1, "aa"

    const-string v2, "bb"

    .line 20
    invoke-static {v1, v2}, Ll/ۨܺ᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    new-instance v1, Ljava/lang/StackTraceElement;

    const-string v2, "a"

    const-string v3, "b"

    const-string v4, "c"

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    const-string v2, "aa"

    .line 22
    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "bb"

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 25
    monitor-exit v0

    return-void

    .line 23
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "JavaHook probe failed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static synthetic ᩷()Ljava/lang/String;
    .locals 1

    .line 54
    sget-object v0, Ll/ۨܺ᩸;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public static declared-synchronized ᩸()V
    .locals 2

    .line 2
    const-class v0, Ll/ۨܺ᩸;

    .line 3
    monitor-enter v0

    .line 32
    :try_start_0
    sget-boolean v1, Ll/ۨܺ᩸;->ۤ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 33
    monitor-exit v0

    return-void

    .line 35
    :cond_0
    :try_start_1
    invoke-static {}, Ll/ۨܺ᩸;->ۤ()V

    const/4 v1, 0x1

    .line 36
    sput-boolean v1, Ll/ۨܺ᩸;->ۤ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
