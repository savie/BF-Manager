.class public final Ll/᩷ܶۖ;
.super Ljava/lang/Object;
.source "MAK5"


# static fields
.field public static ۙ:Ljava/lang/String; = ""

.field public static volatile ۨ:Z = false

.field public static ܰ:Ljava/lang/String; = ""

.field private static final ᩶᩸ܿ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩷ܶۖ;->᩶᩸ܿ:[S

    return-void

    :array_0
    .array-data 2
        0x1das
        0x6c14s
        0x6c16s
        0x6c07s
        0x6c30s
        0x6c1fs
        0x6c12s
        0x6c00s
        0x6c00s
        0x6c3ds
        0x6c12s
        0x6c1es
        0x6c16s
        0x6c14s
        0x6c16s
        0x6c07s
        0x6c3es
        0x6c16s
        0x6c07s
        0x6c1bs
        0x6c1cs
        0x6c17s
        0x6c3ds
        0x6c12s
        0x6c1es
        0x6c16s
    .end array-data
.end method

.method public static declared-synchronized ۖ()V
    .locals 2

    .line 2
    const-class v0, Ll/᩷ܶۖ;

    .line 3
    monitor-enter v0

    .line 32
    :try_start_0
    sget-boolean v1, Ll/᩷ܶۖ;->ۨ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 33
    monitor-exit v0

    return-void

    .line 35
    :cond_0
    :try_start_1
    invoke-static {}, Ll/᩷ܶۖ;->ۨ()V

    const/4 v1, 0x1

    .line 36
    sput-boolean v1, Ll/᩷ܶۖ;->ۨ:Z
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

.method public static synthetic ۙ()Ljava/lang/String;
    .locals 1

    .line 50
    sget-object v0, Ll/᩷ܶۖ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 62
    sget-boolean v0, Ll/᩷ܶۖ;->ۨ:Z

    if-nez v0, :cond_0

    return-void

    .line 65
    :cond_0
    sput-object p0, Ll/᩷ܶۖ;->ۙ:Ljava/lang/String;

    .line 66
    sput-object p1, Ll/᩷ܶۖ;->ܰ:Ljava/lang/String;

    return-void
.end method

.method public static declared-synchronized ۚ()V
    .locals 6

    .line 2
    const-class v0, Ll/᩷ܶۖ;

    .line 3
    monitor-enter v0

    .line 19
    :try_start_0
    invoke-static {}, Ll/᩷ܶۖ;->ۖ()V

    const-string v1, "aa"

    const-string v2, "bb"

    .line 20
    invoke-static {v1, v2}, Ll/᩷ܶۖ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

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

.method public static ۨ()V
    .locals 24

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, 0x2724536e

    sget v18, Ll/֡۠;->ۛ᩻ۧ:I

    sget v19, Ll/ۖܽ;->ܳ۠᩹:I

    const-string v20, "\u06d7\u06e8"

    invoke-static/range {v20 .. v20}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v18

    mul-int/lit8 v20, v20, 0x67

    xor-int v0, v20, v19

    mul-int/lit16 v0, v0, -0x318d

    const v22, -0x13502c65

    xor-int v0, v0, v22

    const v22, 0x336e7f4b

    xor-int v20, v20, v22

    move-object/from16 v17, v6

    move-object v14, v13

    move-object v4, v15

    move/from16 v21, v20

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const v20, 0x2724536e

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object v6, v5

    move-object v5, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v9, v20, v19

    mul-int/lit16 v9, v9, 0xf9f

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v0, v9

    xor-int v20, v21, v0

    sparse-switch v20, :sswitch_data_0

    .line 49
    const-class v1, Ljava/lang/StackTraceElement;

    sget-object v14, Ll/᩷ܶۖ;->᩶᩸ܿ:[S

    const/4 v15, 0x1

    sget v0, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v0, :cond_5

    goto/16 :goto_3

    .line 52
    :sswitch_0
    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v0, :cond_7

    goto :goto_1

    .line 50
    :sswitch_1
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_9

    goto/16 :goto_4

    .line 49
    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v0

    if-nez v0, :cond_c

    goto :goto_1

    .line 51
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    :goto_1
    const-string v0, "\u06d8\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x189d

    const v21, 0x7aaa15c0

    xor-int v9, v9, v21

    const v21, -0x6b44ac55

    goto/16 :goto_5

    .line 50
    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    return-void

    .line 53
    :sswitch_5
    invoke-virtual {v1, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 54
    new-instance v1, Ll/۟ܶۖ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Lorg/lsposed/lsplant/Hooker;->ۙ(Ljava/lang/reflect/Method;Ll/֫᩶ۡ;)V

    return-void

    :sswitch_6
    const/16 v0, 0xd

    .line 50
    invoke-static {v4, v7, v0, v13}, Ll/ۖᩴ;->֨᩶᩵([SIII)Ljava/lang/String;

    move-result-object v6

    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v0, "\u05a1\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x11

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x2f07

    const v21, -0x44b62f55

    xor-int v9, v9, v21

    const v21, 0x53f529c5

    goto/16 :goto_5

    :sswitch_7
    invoke-static {v5, v8}, Lorg/lsposed/lsplant/Hooker;->ۙ(Ljava/lang/reflect/Method;Ll/֫᩶ۡ;)V

    sget-object v4, Ll/᩷ܶۖ;->᩶᩸ܿ:[S

    const/16 v7, 0xd

    .line 51
    sget v0, Ll/֫;->ܶܺ᩻:I

    if-ltz v0, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v0, "\u073f\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x5f

    xor-int v9, v0, v19

    mul-int/lit16 v9, v9, -0x72fb

    const v21, 0x794885bd

    xor-int v9, v9, v21

    const v21, 0x45129759

    goto/16 :goto_5

    :sswitch_8
    const/4 v3, 0x0

    .line 49
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 50
    new-instance v8, Ll/ۤܶۖ;

    .line 49
    sget v0, Ll/ۗ;->֨۬ۖ:I

    if-ltz v0, :cond_2

    goto/16 :goto_4

    .line 50
    :cond_2
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    sget v0, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v0, :cond_3

    const-string v0, "\u06e2\u1a78"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v19

    mul-int/lit16 v9, v9, -0x6ef

    const v21, 0x59c32a51

    xor-int v9, v9, v21

    const v21, 0x162683d6

    goto/16 :goto_5

    :cond_3
    const-string v0, "\u06d9\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x23

    xor-int v9, v0, v19

    mul-int/lit16 v9, v9, 0x53d1

    const v21, 0x258c99d1

    xor-int v9, v9, v21

    const v21, 0x688d62d5

    goto/16 :goto_5

    :sswitch_9
    const/16 v0, 0xc

    .line 49
    invoke-static {v14, v15, v0, v13}, Ll/֫ܳ;->᩵ۘ᩵([SIII)Ljava/lang/String;

    move-result-object v2

    sget v0, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v0, "\u06d6\u05a8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x2d

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x4fa3

    const v21, 0x587d3087

    xor-int v9, v9, v21

    const v21, -0x16cd0f66

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u06d9\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x5fd9

    const v21, -0x42316fd1

    xor-int v9, v9, v21

    const v21, 0x780dd006

    goto/16 :goto_5

    :sswitch_a
    const/16 v0, 0x2e7

    const/16 v13, 0x2e7

    goto :goto_2

    :sswitch_b
    const/16 v0, 0x6c73

    const/16 v13, 0x6c73

    :goto_2
    const-string v0, "\u1a75\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x59

    xor-int v9, v0, v19

    mul-int/lit16 v9, v9, -0x487f

    const v21, -0xdece92e

    xor-int v9, v9, v21

    const v21, 0x2c1bcd0

    goto/16 :goto_5

    :sswitch_c
    add-int v0, v11, v12

    sub-int/2addr v0, v10

    if-gez v0, :cond_6

    const-string v0, "\u073d\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x6c15

    const v21, -0x3aabd5a6

    xor-int v9, v9, v21

    const v21, 0x4ddcffb1    # 4.6346806E8f

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u06ec\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x37

    xor-int v9, v0, v19

    mul-int/lit16 v9, v9, 0x7c65

    const v21, -0x5fa4c8c4

    xor-int v9, v9, v21

    const v21, 0x3d9a110c

    goto/16 :goto_5

    :sswitch_d
    mul-int v11, v23, v23

    const v12, 0x126ce644

    .line 53
    sget v0, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v0, :cond_8

    :cond_7
    const-string v0, "\u073f\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x4c9b

    const v21, 0x679890a9

    xor-int v9, v9, v21

    const v21, 0x63057521

    goto/16 :goto_5

    :cond_8
    const-string v0, "\u073d\u1a74"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x2251

    const v21, -0x3e9d1e8

    xor-int v9, v9, v21

    const v21, -0x406c45d

    goto/16 :goto_5

    :sswitch_e
    const v0, 0x895c

    mul-int v10, v23, v0

    .line 50
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    :goto_3
    const-string v0, "\u05a1\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x65

    xor-int v9, v0, v19

    mul-int/lit16 v9, v9, -0x75fb

    const v21, -0x4b5f2808

    xor-int v9, v9, v21

    const v21, -0x572c85f5

    goto :goto_5

    :cond_a
    const-string v0, "\u06ec\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x43

    xor-int v9, v0, v19

    mul-int/lit16 v9, v9, -0x22fd

    const v21, 0x1e38ef94

    xor-int v9, v9, v21

    const v21, 0x6ddd3dd5

    goto :goto_5

    :sswitch_f
    aget-short v23, v17, v22

    .line 52
    sget-boolean v0, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v0, :cond_b

    goto :goto_4

    :cond_b
    const-string v0, "\u1a76\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x3ce9

    const v21, -0x4568ae0f

    xor-int v9, v9, v21

    const v21, -0x3564e89

    goto :goto_5

    :sswitch_10
    sget-object v17, Ll/᩷ܶۖ;->᩶᩸ܿ:[S

    const/16 v22, 0x0

    .line 49
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_c
    :goto_4
    const-string v0, "\u06db\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x69

    xor-int v8, v0, v19

    mul-int/lit16 v8, v8, 0x251b

    const v9, -0x6d669ac5

    xor-int/2addr v8, v9

    const v9, -0x43e3e590

    xor-int v21, v0, v9

    move v0, v8

    const/4 v8, 0x0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u1a75\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x73

    xor-int v9, v0, v19

    mul-int/lit16 v9, v9, -0x4aed

    const v21, -0x7e0867a

    xor-int v9, v9, v21

    const v21, 0x5887c7cb

    :goto_5
    xor-int v21, v0, v21

    move v0, v9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74df0d6e -> :sswitch_4
        -0x69d81132 -> :sswitch_b
        -0x67484a42 -> :sswitch_8
        -0x650b9fb1 -> :sswitch_5
        -0x627df454 -> :sswitch_f
        -0x568dba6d -> :sswitch_3
        -0x524785b5 -> :sswitch_3
        -0x4e396800 -> :sswitch_c
        -0x34c95212 -> :sswitch_6
        -0x25144a8d -> :sswitch_d
        -0x2446b395 -> :sswitch_d
        -0x2038c433 -> :sswitch_f
        -0x1f6f9fd1 -> :sswitch_1
        -0x1cce0f33 -> :sswitch_e
        -0x1b9d44b2 -> :sswitch_c
        -0x17a90bef -> :sswitch_10
        -0x14f588f3 -> :sswitch_0
        0xb516f67 -> :sswitch_0
        0xbd284f4 -> :sswitch_4
        0x1936f9e7 -> :sswitch_e
        0x1ec4136e -> :sswitch_8
        0x377fbe67 -> :sswitch_2
        0x4a955f97 -> :sswitch_5
        0x4c847a31 -> :sswitch_2
        0x52477f52 -> :sswitch_a
        0x547989aa -> :sswitch_10
        0x5590b72f -> :sswitch_6
        0x607715fe -> :sswitch_7
        0x6368ec38 -> :sswitch_9
        0x679644fc -> :sswitch_9
        0x695b7131 -> :sswitch_b
        0x6c0ed324 -> :sswitch_a
        0x6faa162b -> :sswitch_7
        0x7c9ee896 -> :sswitch_1
    .end sparse-switch
.end method

.method public static synthetic ܰ()Ljava/lang/String;
    .locals 1

    .line 54
    sget-object v0, Ll/᩷ܶۖ;->ܰ:Ljava/lang/String;

    return-object v0
.end method
