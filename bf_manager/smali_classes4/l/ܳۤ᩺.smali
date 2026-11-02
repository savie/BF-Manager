.class public final synthetic Ll/ܳۤ᩺;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܺ:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ܳۤ᩺;->ܺ:J

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 13

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x31ae5239

    sget v8, Ll/֡۠;->ۛ᩻ۧ:I

    sget v9, Ll/֡ۚ;->ۢܰ᩸:I

    const-string v10, "\u0736\u073f"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x17cb

    const v12, -0x5377a3bd

    xor-int/2addr v11, v12

    const v12, 0x6bc52a3d

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0x64df

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    const v6, 0x7266748

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_2

    .line 111
    :sswitch_0
    sget-boolean v10, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v10, :cond_b

    goto :goto_1

    .line 69
    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v10, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez v10, :cond_7

    goto :goto_1

    .line 90
    :sswitch_2
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget v10, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v10, :cond_1

    goto :goto_1

    .line 35
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    :goto_1
    const-string v10, "\u05a8\u073f"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6b63

    const v12, 0x4218b6a8

    xor-int/2addr v11, v12

    const v12, 0x413b844e

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    return-void

    :sswitch_5
    xor-int p1, v5, v6

    .line 124
    iput p1, v0, Ll/ܶ۟᩺;->ۚ:I

    return-void

    :cond_0
    const-string v10, "\u073f\u1a7b"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7f35

    const v12, 0x6ce3011a

    xor-int/2addr v11, v12

    const v12, 0x6c497fbb

    goto :goto_0

    :sswitch_6
    div-long v10, v1, v3

    long-to-int v5, v10

    .line 22
    sget v10, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v10, :cond_2

    :cond_1
    :goto_2
    const-string v10, "\u06db\u1a74"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x3f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7b91

    const v12, 0x6e0c9e18

    xor-int/2addr v11, v12

    const v12, 0x3bdd6cb8

    goto :goto_0

    :cond_2
    const-string v10, "\u05a1\u073a"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7a4b

    const v12, 0x7ae7c78a

    xor-int/2addr v11, v12

    const v12, 0x1693e12a

    goto/16 :goto_0

    .line 123
    :sswitch_7
    iput-wide v1, v0, Ll/ܶ۟᩺;->ᩴ:J

    const-wide/16 v3, 0x3e8

    sget v10, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v10, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v10, "\u073d\u1a7b"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x6f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x231f

    const v12, -0x7eab593f

    xor-int/2addr v11, v12

    const v12, -0x41388c30

    goto/16 :goto_0

    :sswitch_8
    iget-wide v1, p0, Ll/ܳۤ᩺;->ܺ:J

    .line 122
    sget v10, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v10, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v10, "\u1a77\u0736"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4675

    const v12, -0x49665121    # -4.580113E-6f

    xor-int/2addr v11, v12

    const v12, 0x39ba7332

    goto/16 :goto_0

    .line 2
    :sswitch_9
    move-object v0, p1

    check-cast v0, Ll/ܶ۟᩺;

    .line 92
    sget-boolean v10, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v10, :cond_5

    goto :goto_3

    :cond_5
    const-string v10, "\u06d6\u06e1"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x21

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1833

    const v12, 0x6e904129

    xor-int/2addr v11, v12

    const v12, -0x1e596b2b

    goto/16 :goto_0

    .line 84
    :sswitch_a
    sget-boolean v10, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v10, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v10, "\u1a75\u06eb"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x5d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2fdb

    const v12, 0x6b89417c

    xor-int/2addr v11, v12

    const v12, 0x218a5fe5

    goto/16 :goto_0

    .line 107
    :sswitch_b
    sget-boolean v10, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v10, :cond_8

    :cond_7
    :goto_3
    const-string v10, "\u1a79\u1a7a"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x421d

    const v12, -0x1b3c5a14

    xor-int/2addr v11, v12

    const v12, 0xbe52962

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u06eb\u06ec"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0xf

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x152f

    const v12, -0x5d6c2fa0

    xor-int/2addr v11, v12

    const v12, 0x36a4edcb

    goto/16 :goto_0

    .line 65
    :sswitch_c
    sget v10, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v10, :cond_9

    :goto_4
    const-string v10, "\u1a76\u0730"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7133

    const v12, -0x4ef377a9

    xor-int/2addr v11, v12

    const v12, -0x165449c0

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u1a7b\u05a8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x63e7

    const v12, 0x15027435

    xor-int/2addr v11, v12

    const v12, 0x680493c8

    goto/16 :goto_0

    .line 10
    :sswitch_d
    sget v10, Ll/֨ۧ;->֫۠֡:I

    if-gtz v10, :cond_a

    goto :goto_5

    :cond_a
    const-string v10, "\u1a78\u06eb"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6db3

    const v12, -0x125c67e0

    xor-int/2addr v11, v12

    const v12, -0x19b52b86

    goto/16 :goto_0

    .line 93
    :sswitch_e
    sget v10, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v10, :cond_c

    :cond_b
    :goto_5
    const-string v10, "\u1a77\u05a8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x28d

    const v12, -0x3842ba4f

    xor-int/2addr v11, v12

    const v12, -0x2c2c46d1

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u1a73\u06d6"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6405

    const v12, -0x18ec1044

    xor-int/2addr v11, v12

    const v12, -0x6820b468

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79dad1e1 -> :sswitch_4
        -0x75548dc4 -> :sswitch_d
        -0x6aa59d6e -> :sswitch_3
        -0x6a6d8821 -> :sswitch_c
        -0x68a149ad -> :sswitch_d
        -0x5df7c534 -> :sswitch_9
        -0x56f0cee4 -> :sswitch_a
        -0x5021841b -> :sswitch_a
        -0x4b1c3811 -> :sswitch_6
        -0x45f284e9 -> :sswitch_3
        -0x37efe559 -> :sswitch_e
        -0x3063ad0c -> :sswitch_5
        -0xb48ee43 -> :sswitch_1
        -0xb2071a3 -> :sswitch_0
        0xaeccccc -> :sswitch_7
        0xe6203a3 -> :sswitch_8
        0x16916524 -> :sswitch_2
        0x24ce4bca -> :sswitch_7
        0x262d4d85 -> :sswitch_e
        0x2d9da8c9 -> :sswitch_8
        0x31a1e180 -> :sswitch_0
        0x3c5efb06 -> :sswitch_b
        0x3fc852f6 -> :sswitch_9
        0x459c395a -> :sswitch_c
        0x4f0635a6 -> :sswitch_5
        0x4faae157 -> :sswitch_2
        0x5c4c31be -> :sswitch_4
        0x7005556d -> :sswitch_1
        0x70835a86 -> :sswitch_6
        0x7570aa22 -> :sswitch_b
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֨᩻ᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
