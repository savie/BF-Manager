.class public final synthetic Ll/ܺۜ֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, -0x8aecdd

    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    .line 0
    iput p1, p0, Ll/ܺۜ֫;->ܰ:I

    iput-object p2, p0, Ll/ܺۜ֫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06eb\u06df"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0xd

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x75d1

    const v3, 0x4c3bf89a    # 4.9275496E7f

    xor-int/2addr p2, v3

    const v3, -0x14d4b638

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x69af

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 2
    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget p1, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u05a8\u073a"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0xea5

    const v3, -0x6ec25a29

    xor-int/2addr p2, v3

    const v3, -0x2c397ff3

    goto :goto_0

    .line 4
    :sswitch_1
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a7b\u06e8"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x3f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x6193

    const v3, -0x7ae88ae1

    xor-int/2addr p2, v3

    const v3, -0x2c25658d

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget p1, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u1a73\u05ab"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7423

    const v3, 0x6164e85c

    xor-int/2addr p2, v3

    const v3, -0xfdfb157

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    :goto_2
    const-string p1, "\u06db\u073a"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x7b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1f89

    const v3, 0x4812adf4

    xor-int/2addr p2, v3

    const v3, -0x4431fde7

    goto/16 :goto_0

    :sswitch_4
    return-void

    .line 3
    :sswitch_5
    sget-boolean p1, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz p1, :cond_3

    const-string p1, "\u06e0\u06d9"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x19c7

    const v3, 0x5d2c64d7

    xor-int/2addr p2, v3

    const v3, -0xedbd269

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a7b\u05a1"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0xd

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x1b93

    const v3, -0x6868ea20

    xor-int/2addr p2, v3

    const v3, -0x3ace54d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x728996dd -> :sswitch_3
        -0x72104de6 -> :sswitch_0
        -0x3c4a3b52 -> :sswitch_2
        -0x116cce32 -> :sswitch_2
        -0x9a4a060 -> :sswitch_0
        -0x865fc4e -> :sswitch_5
        0xb394c58 -> :sswitch_1
        0x186acb97 -> :sswitch_3
        0x2bdb752d -> :sswitch_4
        0x379bd513 -> :sswitch_4
        0x3b8f8a39 -> :sswitch_1
        0x73b5eeb4 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x7cea70cf

    sget v2, Ll/֫֡;->֫ۙۖ:I

    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v4, "\u06d7\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2971

    const v6, -0x44803e53

    xor-int/2addr v5, v6

    const v6, -0x26314fb8

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0xa4d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_2

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-gez v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06e0\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x34b1

    const v6, -0x44f8fc77

    xor-int/2addr v5, v6

    const v6, -0xc5139a4

    goto :goto_0

    :sswitch_1
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_b

    goto/16 :goto_3

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-gez v4, :cond_7

    goto/16 :goto_3

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    goto/16 :goto_3

    .line 2
    :sswitch_4
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ܺۜ֫;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/۟ۖ֫;

    invoke-static {v0}, Ll/۟ۖ֫;->ۙ(Ll/۟ۖ֫;)V

    return-void

    :sswitch_6
    invoke-static {v0}, Lbin/mt/plus/Main;->ᩴ(Lbin/mt/plus/Main;)V

    return-void

    .line 3
    :sswitch_7
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06e1\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1bb

    const v6, 0x73be9a71

    xor-int/2addr v5, v6

    const v6, 0x392d75df

    goto :goto_0

    .line 4
    :sswitch_8
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06d6\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x751f

    const v6, 0x1030eb36

    xor-int/2addr v5, v6

    const v6, 0x714382bb

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u0730\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2585

    const v6, 0x6311db9e

    xor-int/2addr v5, v6

    const v6, -0x158cd166

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u1a7a\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6cdb

    const v6, -0x789b3f8f

    xor-int/2addr v5, v6

    const v6, -0x59f0ee50

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06d6\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7a47

    const v6, 0x785bda21

    xor-int/2addr v5, v6

    const v6, -0x44dc5913

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u1a7a\u06e2"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3cc5

    const v6, 0x31441500

    xor-int/2addr v5, v6

    const v6, 0x5667c3f3

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_8

    :cond_7
    :goto_1
    const-string v4, "\u05a1\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2307

    const v6, -0x71b5e17e

    xor-int/2addr v5, v6

    const v6, 0x2f24f4b7

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06da\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x56df

    const v6, 0x63ce5a75

    xor-int/2addr v5, v6

    const v6, 0x34aa52bd

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v4, :cond_9

    :goto_2
    const-string v4, "\u1a74\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6edd

    const v6, 0x1a3fc18c

    xor-int/2addr v5, v6

    const v6, 0x70d39216

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a75\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x537f

    const v6, -0x662b4a9d

    xor-int/2addr v5, v6

    const v6, -0x3f9c13b9

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_a

    :goto_3
    const-string v4, "\u06e1\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2a43

    const v6, 0x5e26e390

    xor-int/2addr v5, v6

    const v6, -0x57d843da

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073a\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xe19

    const v6, -0x7222698c

    xor-int/2addr v5, v6

    const v6, 0x649acdfd

    goto/16 :goto_0

    .line 0
    :sswitch_f
    iget-object v0, p0, Ll/ܺۜ֫;->᩶:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plus/Main;

    .line 3
    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v4, :cond_c

    :cond_b
    const-string v4, "\u06ec\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x624d

    const v6, -0x81e844d

    xor-int/2addr v5, v6

    const v6, -0x5b5a29e

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a78\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2067

    const v6, -0x215b5ca

    xor-int/2addr v5, v6

    const v6, -0x7bd8dafd

    goto/16 :goto_0

    .line 0
    :sswitch_10
    iget v4, p0, Ll/ܺۜ֫;->ܰ:I

    packed-switch v4, :pswitch_data_0

    const-string v4, "\u06da\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7545

    const v6, -0x586d0edf

    xor-int/2addr v5, v6

    const v6, -0x5ae22a0d

    goto/16 :goto_0

    :pswitch_0
    const-string v4, "\u05ab\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2bd

    const v6, 0x1b8195bc

    xor-int/2addr v5, v6

    const v6, 0x7d8675cb

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7de27eb6 -> :sswitch_b
        -0x76fe9d33 -> :sswitch_c
        -0x6a2a9736 -> :sswitch_e
        -0x60270461 -> :sswitch_5
        -0x5f0094a0 -> :sswitch_1
        -0x480ed250 -> :sswitch_6
        -0x45301619 -> :sswitch_1
        -0x3aee7ddd -> :sswitch_10
        -0x39986bfd -> :sswitch_0
        -0x32ba542d -> :sswitch_e
        -0x24942173 -> :sswitch_c
        -0x1eb95fe3 -> :sswitch_4
        -0x13833163 -> :sswitch_5
        -0xdbd4218 -> :sswitch_9
        -0xcf76306 -> :sswitch_7
        0x6b1b74 -> :sswitch_f
        0xdbabd1 -> :sswitch_3
        0x12f79b1 -> :sswitch_f
        0xa6a2ae8 -> :sswitch_a
        0x1bc0a7dc -> :sswitch_8
        0x27f506fa -> :sswitch_b
        0x3550d3ec -> :sswitch_3
        0x38229851 -> :sswitch_7
        0x534fc210 -> :sswitch_6
        0x56e827c7 -> :sswitch_4
        0x58c9a907 -> :sswitch_a
        0x5cc4f7c8 -> :sswitch_8
        0x63f1f250 -> :sswitch_10
        0x65f56473 -> :sswitch_2
        0x683e02ce -> :sswitch_d
        0x6ae0c8ba -> :sswitch_0
        0x6e6e4e99 -> :sswitch_2
        0x72f1b8bd -> :sswitch_d
        0x77731605 -> :sswitch_9
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
