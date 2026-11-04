.class public final synthetic Ll/ۙ۟֫;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/᩷۟֫;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/᩷۟֫;Ljava/lang/String;)V
    .locals 6

    const v0, -0x14a980fd

    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    sget v2, Ll/֨ܿ;->᩹᩻۟:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7a\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x397d

    const v5, 0x25e35dea

    xor-int/2addr v4, v5

    const v5, 0x7f33d817

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3cd3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/ۙ۟֫;->ܰ:Ll/᩷۟֫;

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v3

    if-eqz v3, :cond_c

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_9

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v3

    if-ltz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a7a\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7123

    const v5, -0x61f21aad

    xor-int/2addr v4, v5

    const v5, 0x810b3ea

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_b

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto/16 :goto_2

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/ۙ۟֫;->᩶:Ljava/lang/String;

    return-void

    .line 3
    :sswitch_6
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u073f\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xb7b

    const v5, 0x487d2260    # 259209.5f

    xor-int/2addr v4, v5

    const v5, 0x359f90c6

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v3

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a78\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1ccb

    const v5, 0x14775bc4

    xor-int/2addr v4, v5

    const v5, -0x149a9f6e    # -2.7730005E26f

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u1a7a\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6d3d

    const v5, 0x4913cd6d

    xor-int/2addr v4, v5

    const v5, -0x6ea32106

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_4

    :goto_1
    const-string v3, "\u1a79\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7933

    const v5, 0x2d250607

    xor-int/2addr v4, v5

    const v5, -0x2ad06707

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0733\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x22a3

    const v5, 0x2af054d

    xor-int/2addr v4, v5

    const v5, -0x320e4fc5

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u1a73\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x382b

    const v5, -0x35b5219e

    xor-int/2addr v4, v5

    const v5, 0x293154bc

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u06dc\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x381f

    const v5, -0x4d9d5d

    xor-int/2addr v4, v5

    const v5, 0x58c3c58

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u1a73\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7fc3

    const v5, 0x779f6443

    xor-int/2addr v4, v5

    const v5, -0x640a1bd

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v3

    if-eqz v3, :cond_8

    :goto_2
    const-string v3, "\u1a79\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7f17

    const v5, 0x68996707

    xor-int/2addr v4, v5

    const v5, -0x1274b7c8

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0736\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5603

    const v5, 0x67ad2eba

    xor-int/2addr v4, v5

    const v5, 0x112e2908

    goto/16 :goto_0

    .line 3
    :sswitch_e
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v3

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e7\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2d41

    const v5, 0x4cb5020b    # 9.490031E7f

    xor-int/2addr v4, v5

    const v5, 0x63bd5a3b

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0730\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a77

    const v5, -0x1ddb47a3

    xor-int/2addr v4, v5

    const v5, -0x54c55d5c

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v3, "\u06db\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x735

    const v5, -0x636a475d

    xor-int/2addr v4, v5

    const v5, 0x1101f50b

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x361f

    const v5, 0x2e3841c0

    xor-int/2addr v4, v5

    const v5, 0x70b5a7cf

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c8aa451 -> :sswitch_0
        -0x792cb750 -> :sswitch_2
        -0x76cbf732 -> :sswitch_6
        -0x767b3db9 -> :sswitch_8
        -0x756cb751 -> :sswitch_9
        -0x70554f1c -> :sswitch_9
        -0x6cf8579d -> :sswitch_5
        -0x62181ab2 -> :sswitch_d
        -0x5a3ed6cb -> :sswitch_4
        -0x505c8c4d -> :sswitch_8
        -0x456f2d54 -> :sswitch_2
        -0x4480ea50 -> :sswitch_e
        -0x38933a11 -> :sswitch_1
        -0x205ffa63 -> :sswitch_c
        -0x18f871d5 -> :sswitch_5
        -0xde1775 -> :sswitch_1
        0x1bacbc5f -> :sswitch_0
        0x1d158ab6 -> :sswitch_a
        0x1e484f02 -> :sswitch_4
        0x2052db85 -> :sswitch_b
        0x2da86f6e -> :sswitch_e
        0x37c74ec1 -> :sswitch_7
        0x460c5d1e -> :sswitch_7
        0x4c1c76e0 -> :sswitch_a
        0x54e96fb1 -> :sswitch_3
        0x5f24cf50 -> :sswitch_b
        0x73530933 -> :sswitch_3
        0x737ce820 -> :sswitch_c
        0x7607b465 -> :sswitch_d
        0x7940d319 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    const/4 p1, 0x0

    const p2, -0x4b575bde

    sget v0, Ll/᩺;->۫۬۫:I

    sget v1, Ll/ۖ;->ܿۚ֡:I

    const-string v2, "\u073f\u06d6"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0xce7

    const v4, -0x2bad6736

    xor-int/2addr v3, v4

    const v4, 0x25c5277a

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p2, v1

    mul-int/lit16 p2, p2, 0x7e55

    shr-int/lit8 p2, p2, 0x1f

    and-int/2addr p2, v3

    xor-int/2addr p2, v2

    sparse-switch p2, :sswitch_data_0

    .line 113
    sget v2, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v2, :cond_c

    goto/16 :goto_5

    .line 137
    :sswitch_0
    sget v2, Ll/֫֨;->᩶ܺۡ:I

    if-lez v2, :cond_4

    goto/16 :goto_2

    .line 149
    :sswitch_1
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v2, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    sget v2, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v2, :cond_9

    goto/16 :goto_2

    .line 109
    :sswitch_3
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    goto/16 :goto_2

    .line 153
    :sswitch_4
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    return-void

    .line 169
    :sswitch_5
    iget-object p2, p0, Ll/ۙ۟֫;->ܰ:Ll/᩷۟֫;

    iget-object p2, p2, Ll/᩷۟֫;->ܳ:Ll/ܺ۟֫;

    invoke-static {p2, p1}, Lbin/mt/plus/Main;->ۙ(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 2
    :sswitch_6
    iget-object p1, p0, Ll/ۙ۟֫;->᩶:Ljava/lang/String;

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v2, "\u06e0\u073f"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x4f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2c25

    const v4, -0x3943526e

    xor-int/2addr v3, v4

    const v4, 0x151d28db

    goto :goto_0

    .line 9
    :sswitch_7
    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v2, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v2, "\u06da\u06d9"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x7c6b

    const v4, 0x276af1aa

    xor-int/2addr v3, v4

    const v4, -0x6e5237e4

    goto :goto_0

    .line 166
    :sswitch_8
    sget-boolean v2, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v2, "\u05a8\u1a77"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x65

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x22cb

    const v4, -0x57196673

    xor-int/2addr v3, v4

    const v4, -0x1144cc32

    goto/16 :goto_0

    .line 44
    :sswitch_9
    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v2, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v2, "\u06da\u06eb"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x9

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x1681

    const v4, -0x438cb42c

    xor-int/2addr v3, v4

    const v4, -0x5db4f6a2

    goto/16 :goto_0

    .line 20
    :sswitch_a
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    :goto_1
    const-string v2, "\u073d\u05ab"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x3f

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4f21

    const v4, -0x627b16cd

    xor-int/2addr v3, v4

    const v4, 0x89eff7b

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u1a74\u1a76"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x645d

    const v4, 0x1e14218

    xor-int/2addr v3, v4

    const v4, -0x1197aa40

    goto/16 :goto_0

    :sswitch_b
    sget v2, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v2, :cond_6

    goto :goto_3

    :cond_6
    const-string v2, "\u06eb\u06e4"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x2f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x3b0d

    const v4, -0x5c4a29f8

    xor-int/2addr v3, v4

    const v4, 0x6cf96e8c

    goto/16 :goto_0

    .line 7
    :sswitch_c
    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v2, :cond_7

    :goto_2
    const-string v2, "\u1a77\u05a1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5199

    const v4, -0x11d7d709

    xor-int/2addr v3, v4

    const v4, 0x2a1a0607

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06d8\u06d8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x67

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x5339

    const v4, 0x7702804d

    xor-int/2addr v3, v4

    const v4, 0x3855b19f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v2

    if-eqz v2, :cond_8

    :goto_3
    const-string v2, "\u1a7b\u1a78"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x7f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x17ad

    const v4, 0x3f346e5

    xor-int/2addr v3, v4

    const v4, -0x1028d1f0

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u0733\u0733"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x63

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x59a3

    const v4, -0x6f38758

    xor-int/2addr v3, v4

    const v4, 0x5cdacb36

    goto/16 :goto_0

    .line 109
    :sswitch_e
    sget v2, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v2, :cond_a

    :cond_9
    :goto_4
    const-string v2, "\u06eb\u05a1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x2315

    const v4, -0x2a941e

    xor-int/2addr v3, v4

    const v4, -0x4f493ab3

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06df\u06e7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x1641

    const v4, -0x3b6a7461

    xor-int/2addr v3, v4

    const v4, 0x59606109

    goto/16 :goto_0

    :cond_b
    :goto_5
    const-string v2, "\u0733\u073a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x7d

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x2825

    const v4, 0x33aa9dd8

    xor-int/2addr v3, v4

    const v4, -0xee1f81a

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u1a7b\u06e8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x15

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x3a19

    const v4, -0x34fdc780    # -8534144.0f

    xor-int/2addr v3, v4

    const v4, -0x39121a43

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f738247 -> :sswitch_a
        -0x7b1fc78d -> :sswitch_3
        -0x72f64642 -> :sswitch_1
        -0x6ff9f3c2 -> :sswitch_1
        -0x5c952441 -> :sswitch_a
        -0x4fb150bf -> :sswitch_8
        -0x4e823700 -> :sswitch_b
        -0x3be7236d -> :sswitch_2
        -0x36f7915b -> :sswitch_c
        -0x34e8997c -> :sswitch_e
        -0x3031d14b -> :sswitch_2
        -0x2688db18 -> :sswitch_d
        -0x2506995b -> :sswitch_0
        -0x120426a4 -> :sswitch_e
        -0xb43cd26 -> :sswitch_9
        -0x8ac965b -> :sswitch_7
        0x10fa6f9b -> :sswitch_4
        0x11ba8d2a -> :sswitch_6
        0x14689548 -> :sswitch_5
        0x203dc383 -> :sswitch_8
        0x214fc94c -> :sswitch_b
        0x30a18752 -> :sswitch_3
        0x32a4a59f -> :sswitch_4
        0x392477dc -> :sswitch_5
        0x65675ee8 -> :sswitch_c
        0x67ba892c -> :sswitch_7
        0x682a8860 -> :sswitch_6
        0x6c054140 -> :sswitch_d
        0x6e7c854b -> :sswitch_9
        0x736b214c -> :sswitch_0
    .end sparse-switch
.end method
