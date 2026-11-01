.class public abstract Ll/ۗ֨ۘ;
.super Ljava/lang/Object;
.source "I3YL"


# instance fields
.field public ֨:Z

.field public ۖ:Lbin/mt/plugin/api/preference/PluginPreference$OnClickInterceptListener;

.field public ۙ:Z

.field public ۚ:Ljava/lang/CharSequence;

.field public ۨ:Ljava/lang/String;

.field public ܰ:Ljava/lang/Object;

.field public ᩹:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x7c86731f

    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u1a75\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2b59

    const v6, 0xebce37c

    xor-int/2addr v5, v6

    const v6, -0x49473797

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x5349

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 4
    :sswitch_0
    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v4, :cond_8

    goto/16 :goto_3

    :sswitch_1
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06db\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x364d

    const v6, 0x6ee36b79

    xor-int/2addr v5, v6

    const v6, -0x5af80de3

    goto :goto_0

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v4

    if-lez v4, :cond_6

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_3

    .line 12
    :sswitch_4
    iput-boolean v0, p0, Ll/ۗ֨ۘ;->ۙ:Z

    return-void

    .line 7
    :sswitch_5
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u05ab\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4af9

    const v6, 0x3237d403

    xor-int/2addr v5, v6

    const v6, 0xe163dfa

    goto :goto_0

    :sswitch_6
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u06d6\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4bb1

    const v6, 0x670f8232    # 6.777001E23f

    xor-int/2addr v5, v6

    const v6, 0x53875fe2

    goto :goto_0

    .line 8
    :sswitch_7
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u0730\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x192b

    const v6, -0x483de96d

    xor-int/2addr v5, v6

    const v6, 0x6b6a6a66

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u073d\u06dc"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7c59

    const v6, -0x26b300b6

    xor-int/2addr v5, v6

    const v6, -0x63e5cacc

    goto/16 :goto_0

    .line 11
    :sswitch_9
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u0730\u06e4"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x17e3

    const v6, 0x7688f151

    xor-int/2addr v5, v6

    const v6, -0x19cffc78

    goto/16 :goto_0

    .line 6
    :sswitch_a
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_7

    :cond_6
    :goto_1
    const-string v4, "\u1a74\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x51db

    const v6, -0x55cee5e3

    xor-int/2addr v5, v6

    const v6, -0x35f476c0    # -2286160.0f

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06ec\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x695b

    const v6, 0x2eadf3cb

    xor-int/2addr v5, v6

    const v6, 0x6fcde991

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u1a74\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5d4b

    const v6, -0x62e856f4

    xor-int/2addr v5, v6

    const v6, 0x5eebe0ac

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06d7\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x847

    const v6, -0x51ec4b9

    xor-int/2addr v5, v6

    const v6, 0x2fd4bb17

    goto/16 :goto_0

    .line 8
    :sswitch_c
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v4

    if-nez v4, :cond_a

    :goto_3
    const-string v4, "\u05a1\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3dbb

    const v6, -0x68ee5b02

    xor-int/2addr v5, v6

    const v6, 0x5cb9215b

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e1\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x69ff

    const v6, 0x3ba7f089

    xor-int/2addr v5, v6

    const v6, -0x7c0c850f

    goto/16 :goto_0

    .line 6
    :sswitch_d
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "\u06db\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3475

    const v6, -0x4e89ac0a

    xor-int/2addr v5, v6

    const v6, 0x72fdd8e0

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Ll/ۗ֨ۘ;->֨:Z

    .line 1
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u06d7\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6279

    const v6, 0x26b17ff

    xor-int/2addr v5, v6

    const v6, -0x10a9159d

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0736\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3861

    const v6, -0x1b228043

    xor-int/2addr v5, v6

    const v6, -0x187c3a7f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f2919b4 -> :sswitch_6
        -0x7ed5b485 -> :sswitch_c
        -0x79600d63 -> :sswitch_b
        -0x7377e52f -> :sswitch_a
        -0x726ba9e9 -> :sswitch_1
        -0x66bebc8c -> :sswitch_c
        -0x65304188 -> :sswitch_3
        -0x62bf8e43 -> :sswitch_2
        -0x61d9db0a -> :sswitch_4
        -0x4aab50d3 -> :sswitch_1
        -0x47c40fb6 -> :sswitch_5
        -0x4751460c -> :sswitch_a
        -0x33d217cd -> :sswitch_3
        -0x28c9017d -> :sswitch_9
        -0x273e4871 -> :sswitch_d
        -0xe8e3b19 -> :sswitch_b
        -0x22e1e12 -> :sswitch_8
        0xd8c9351 -> :sswitch_8
        0x1795c1fc -> :sswitch_e
        0x17cd0f9b -> :sswitch_7
        0x185d176d -> :sswitch_9
        0x1b7b636d -> :sswitch_2
        0x34236c54 -> :sswitch_7
        0x45bb38b8 -> :sswitch_e
        0x5add9f5d -> :sswitch_0
        0x63d71bb8 -> :sswitch_6
        0x6ef884ac -> :sswitch_4
        0x70f9cf6f -> :sswitch_d
        0x782cdc14 -> :sswitch_0
        0x7a0e1b81 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public abstract ۙ()Ll/ۢ֨ۘ;
.end method

.method public abstract ۙ(Lbin/mt/plugin/api/LocalString;)V
.end method

.method public abstract ۙ(Lbin/mt/plugin/api/PluginContext;)V
.end method
