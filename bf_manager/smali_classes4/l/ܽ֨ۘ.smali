.class public final Ll/ܽ֨ۘ;
.super Ljava/lang/Object;
.source "A3Z1"

# interfaces
.implements Lbin/mt/plugin/api/PluginContext;


# static fields
.field private static final ۙ֫ᩴ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x82

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    return-void

    :array_0
    .array-data 2
        0x1d62s
        0x6b97s
        0x6b8bs
        0x6b97s
        0x6b93s
        0x6b8bs
        0x6b94s
        0x6b95s
        0x17bas
        0x4af8s
        0x4af3s
        0x4af4s
        0x4ab4s
        0x4af7s
        0x4aees
        0x4ab4s
        0x4aeas
        0x4af6s
        0x4aefs
        0x4afds
        0x4af3s
        0x4af4s
        0x4ab4s
        0x4ae9s
        0x4ae3s
        0x4ae9s
        0x4aees
        0x4affs
        0x4af7s
        0x99cs
        -0x4cb4s
        -0x4c9as
        -0x4c94s
        -0x4c95s
        -0x4c86s
        -0x4c8es
        0x1a14s
        0x5ec5s
        0x5ee2s
        0x5ee4s
        0x5effs
        0x5ef8s
        0x5ef1s
        0x5eb6s
        0x5ef8s
        0x5ef9s
        0x5ee2s
        0x5eb6s
        0x5ef0s
        0x5ef9s
        0x5ee3s
        0x5ef8s
        0x5ef2s
        0x5eacs
        0x5eb6s
        0x231fs
        -0x7db4s
        -0x7dbfs
        -0x7db2s
        -0x7db9s
        -0x7dads
        -0x7dacs
        -0x7daes
        -0x7db7s
        -0x7db2s
        -0x7db9s
        -0x7dads
        0x2370s
        0x5578s
        0x5573s
        0x5574s
        0x5534s
        0x5577s
        0x556es
        0x5534s
        0x556as
        0x5576s
        0x556fs
        0x557ds
        0x5573s
        0x5574s
        0x5534s
        0x5569s
        0x5563s
        0x5569s
        0x556es
        0x557fs
        0x5577s
        0xb2bs
        0x7ac9s
        0x7ac2s
        0x7ac5s
        0x7a85s
        0x7ac6s
        0x7adfs
        0x7a85s
        0x7adbs
        0x7ac7s
        0x7ades
        0x7accs
        0x7ac2s
        0x7ac5s
        0x7a85s
        0x7ad8s
        0x7ad2s
        0x7ad8s
        0x7adfs
        0x7aces
        0x7ac6s
        0x98ds
        -0x69b2s
        -0x69bbs
        -0x69bes
        -0x69fes
        -0x69bfs
        -0x69a8s
        -0x69fes
        -0x69a4s
        -0x69c0s
        -0x69a7s
        -0x69b5s
        -0x69bbs
        -0x69bes
        -0x69fes
        -0x69a1s
        -0x69abs
        -0x69a1s
        -0x69a8s
        -0x69b7s
        -0x69bfs
    .end array-data
.end method


# virtual methods
.method public final cancelToast()V
    .locals 6

    const v0, -0x1696f24a

    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    sget v2, Ll/ۘ֡;->ܰ֡ܽ:I

    const-string v3, "\u06e8\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xb99

    const v5, 0x5efd7159

    xor-int/2addr v4, v5

    const v5, 0x644146de

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x125d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 94
    new-instance v3, Ll/ᩴ᩺ۘ;

    .line 47
    sget-boolean v4, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v4, :cond_0

    goto :goto_1

    .line 44
    :sswitch_0
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez v3, :cond_a

    goto/16 :goto_2

    .line 90
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v3

    if-gez v3, :cond_8

    goto/16 :goto_2

    .line 38
    :sswitch_2
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-eqz v3, :cond_5

    goto/16 :goto_4

    .line 94
    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-direct {v3, v0}, Ll/ᩴ᩺ۘ;-><init>(I)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_5
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v3

    if-gtz v3, :cond_1

    :goto_1
    const-string v3, "\u06e4\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x44e7

    const v5, -0x78c0e76f

    xor-int/2addr v4, v5

    const v5, -0x1a746efd

    goto :goto_0

    :cond_1
    const-string v3, "\u1a77\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x293d

    const v5, 0x142351df

    xor-int/2addr v4, v5

    const v5, -0x6ff1c9fc

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a76\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4823

    const v5, 0x79f6fe6e

    xor-int/2addr v4, v5

    const v5, 0x713b7cd0

    goto/16 :goto_0

    .line 34
    :sswitch_7
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u1a74\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2665

    const v5, 0x2bbaa6b7

    xor-int/2addr v4, v5

    const v5, -0x6a131dc6

    goto/16 :goto_0

    .line 23
    :sswitch_8
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06db\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6cbd

    const v5, 0x75abe986

    xor-int/2addr v4, v5

    const v5, 0x73e1ac8c

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u073d\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x161

    const v5, -0x5b82a68a

    xor-int/2addr v4, v5

    const v5, -0x3d233063

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e7\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4011

    const v5, -0x25825099

    xor-int/2addr v4, v5

    const v5, 0x3f740db8

    goto/16 :goto_0

    .line 108
    :sswitch_a
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06e7\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x22c7

    const v5, -0x3a4a6324

    xor-int/2addr v4, v5

    const v5, 0x76e76872

    goto/16 :goto_0

    .line 64
    :sswitch_b
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_9

    :cond_8
    const-string v3, "\u0736\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7ebd

    const v5, 0x1113f30d

    xor-int/2addr v4, v5

    const v5, -0x3ae5d121

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a78\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a73

    const v5, -0x70b6670a

    xor-int/2addr v4, v5

    const v5, 0xe692ee6

    goto/16 :goto_0

    .line 108
    :sswitch_c
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06e2\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x38c5

    const v5, 0x73cbde16

    xor-int/2addr v4, v5

    const v5, -0x163dd0bd

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a75\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4555

    const v5, 0xe185c02

    xor-int/2addr v4, v5

    const v5, -0x8f07cf5

    goto/16 :goto_0

    .line 229
    :sswitch_d
    sget-object v3, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v3

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u0733\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ab3

    const v5, -0xcf91623

    xor-int/2addr v4, v5

    const v5, -0x2f8763a3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a78\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3f7d

    const v5, -0x387ab608

    xor-int/2addr v4, v5

    const v5, -0x67b57c04

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e07c827 -> :sswitch_4
        -0x7ce2be3d -> :sswitch_1
        -0x75f3ba41 -> :sswitch_2
        -0x67a2fddd -> :sswitch_7
        -0x657bcfaa -> :sswitch_5
        -0x5a466cc8 -> :sswitch_8
        -0x3049354c -> :sswitch_1
        -0x2f361252 -> :sswitch_a
        -0x2c88e3bc -> :sswitch_6
        -0x20877f17 -> :sswitch_b
        -0x1f0d2b48 -> :sswitch_3
        -0x1a325197 -> :sswitch_0
        -0x140babc1 -> :sswitch_d
        -0x8e23492 -> :sswitch_b
        0x29605dce -> :sswitch_3
        0x3ce0ada9 -> :sswitch_7
        0x43d38ac6 -> :sswitch_6
        0x4aa93af8 -> :sswitch_d
        0x4ab527aa -> :sswitch_4
        0x4f149748 -> :sswitch_c
        0x543a6685 -> :sswitch_c
        0x56f46a1b -> :sswitch_9
        0x5fd79572 -> :sswitch_2
        0x661a1e39 -> :sswitch_a
        0x73b68d3a -> :sswitch_9
        0x75b12127 -> :sswitch_5
        0x7b277e17 -> :sswitch_0
        0x7c4fd6e2 -> :sswitch_8
    .end sparse-switch
.end method

.method public final getAssetLocalString(Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 0

    .line 149
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 0

    .line 85
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getClipboardText()Ljava/lang/CharSequence;
    .locals 1

    .line 192
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    .line 75
    invoke-static {}, Ll/᩷᩹ۘ;->ܰ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getFileLocalString(Ljava/io/File;Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 4

    const p1, 0x95ebc9d

    sget p2, Ll/ۖ᩸;->ۨܽ۬:I

    sget v0, Ll/֡֡;->᩶ۤ۠:I

    const-string v1, "\u06da\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x5d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x6bbd

    const v3, -0x47e20a66

    xor-int/2addr v2, v3

    const v3, 0xe80b40a

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0x5b07

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v1, :cond_b

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v1, "\u1a74\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x5b

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x72d

    const v3, -0x11823be0

    xor-int/2addr v2, v3

    const v3, -0x41f8cd92

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget-boolean v1, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v1, :cond_a

    goto/16 :goto_1

    .line 124
    :sswitch_2
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v1, :cond_4

    goto/16 :goto_1

    .line 39
    :sswitch_3
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    goto/16 :goto_1

    .line 4
    :sswitch_4
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    const/4 p1, 0x0

    return-object p1

    .line 155
    :sswitch_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 6
    :sswitch_6
    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u073f\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x2d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0xc6d

    const v3, -0xe909ed

    xor-int/2addr v2, v3

    const v3, 0x35df93b7

    goto :goto_0

    .line 132
    :sswitch_7
    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u06e8\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x5f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x3549

    const v3, 0x46f0dd35

    xor-int/2addr v2, v3

    const v3, -0x2582877d

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v1, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u05a8\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x7321

    const v3, -0x5a121de3

    xor-int/2addr v2, v3

    const v3, -0x2dda0ac4

    goto/16 :goto_0

    :sswitch_9
    sget v1, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v1, :cond_5

    :cond_4
    const-string v1, "\u06e7\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x38bd

    const v3, -0x1b11e57f

    xor-int/2addr v2, v3

    const v3, 0x86d2018

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u05a8\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x7783

    const v3, 0x6ec92590

    xor-int/2addr v2, v3

    const v3, -0xe398ac9

    goto/16 :goto_0

    .line 84
    :sswitch_a
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_1

    :cond_6
    const-string v1, "\u06db\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x73

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x710f

    const v3, -0x2bf51e12

    xor-int/2addr v2, v3

    const v3, -0x3deedafd

    goto/16 :goto_0

    :sswitch_b
    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v1, :cond_7

    goto :goto_2

    :cond_7
    const-string v1, "\u06e8\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x38e5

    const v3, 0x6e10ba3

    xor-int/2addr v2, v3

    const v3, 0x4890480e

    goto/16 :goto_0

    :sswitch_c
    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v1, :cond_8

    :goto_1
    const-string v1, "\u1a74\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x2f

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x1cd1

    const v3, -0x2a7a6c4d

    xor-int/2addr v2, v3

    const v3, 0x4e512d9e    # 8.773569E8f

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06da\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, 0x5d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x2cf5

    const v3, 0x46d57b04

    xor-int/2addr v2, v3

    const v3, -0x67c1bda4

    goto/16 :goto_0

    .line 103
    :sswitch_d
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v1

    if-gtz v1, :cond_9

    goto :goto_3

    :cond_9
    const-string v1, "\u1a79\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x3657

    const v3, -0x4e2bf7d2

    xor-int/2addr v2, v3

    const v3, 0x633f9323

    goto/16 :goto_0

    :cond_a
    :goto_2
    const-string v1, "\u1a74\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x2407

    const v3, -0x5570120e

    xor-int/2addr v2, v3

    const v3, 0x3e436bdc

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u05ab\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x707f

    const v3, -0x35d5b928    # -2789814.0f

    xor-int/2addr v2, v3

    const v3, 0x1e30bbac

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v1, :cond_c

    :goto_3
    const-string v1, "\u0736\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, 0x2d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x2d45

    const v3, 0x52ff998b

    xor-int/2addr v2, v3

    const v3, -0x4f3c6eb4

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u05a1\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x3f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x2a57

    const v3, -0x5d35ff16

    xor-int/2addr v2, v3

    const v3, -0x52bcf10c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x742fbdc7 -> :sswitch_6
        -0x6d351f70 -> :sswitch_8
        -0x628181d5 -> :sswitch_a
        -0x61f02624 -> :sswitch_7
        -0x56a7e276 -> :sswitch_5
        -0x52874be2 -> :sswitch_b
        -0x4a0a3491 -> :sswitch_4
        -0x492dbd8b -> :sswitch_c
        -0x454af17d -> :sswitch_9
        -0x38db5724 -> :sswitch_d
        -0x2c68e49b -> :sswitch_0
        -0x267d526e -> :sswitch_e
        -0x227ce808 -> :sswitch_3
        -0xc85f535 -> :sswitch_7
        -0xa6b0f07 -> :sswitch_9
        0x8fbf996 -> :sswitch_a
        0x1df78808 -> :sswitch_2
        0x24282ae1 -> :sswitch_8
        0x33147e22 -> :sswitch_b
        0x46d585a2 -> :sswitch_6
        0x4a81a7a7 -> :sswitch_1
        0x4ad7d2b0 -> :sswitch_3
        0x4b09a9d8 -> :sswitch_c
        0x521a94db -> :sswitch_d
        0x5aafe4c6 -> :sswitch_e
        0x64d41796 -> :sswitch_5
        0x7190d519 -> :sswitch_1
        0x726acb88 -> :sswitch_2
        0x7c4788f5 -> :sswitch_4
        0x7ddf8aab -> :sswitch_0
    .end sparse-switch
.end method

.method public final getFilesDir()Ljava/io/File;
    .locals 1

    .line 166
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getHostPackageName()Ljava/lang/String;
    .locals 1

    .line 50
    invoke-static {}, Ll/ܽܺۘ;->ᩴ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getHostVersionCode()I
    .locals 1

    const v0, 0x18e4545

    return v0
.end method

.method public final getHostVersionName()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0xd96806a

    sget v11, Ll/ۧ;->֫۠ᩴ:I

    sget v12, Ll/ۖۧ;->ܺۚۖ:I

    const-string v13, "\u06e0\u06e1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x51

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x269f

    const v15, -0x327d2690

    xor-int/2addr v14, v15

    const v15, 0x68738bf1

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x4943

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    aget-short v2, v0, v1

    .line 0
    sget v13, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v13, :cond_6

    goto/16 :goto_4

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    sget v13, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v13, :cond_8

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v13, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v13, :cond_0

    goto/16 :goto_3

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v13

    if-gez v13, :cond_b

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_3

    .line 0
    :sswitch_4
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v0, 0x7

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/֨ܰ;->ܺۖ۫([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v8, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    const/4 v9, 0x1

    .line 0
    sget v13, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v13, :cond_1

    :cond_0
    :goto_1
    const-string v13, "\u06ec\u1a77"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x66b3

    const v15, 0x79d2ad18

    xor-int/2addr v14, v15

    const v15, 0x67121655

    goto :goto_0

    :cond_1
    const-string v13, "\u1a7b\u1a7b"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x55e1

    const v15, -0x2e55f0eb

    xor-int/2addr v14, v15

    const v15, 0x2f4ea3b3

    goto :goto_0

    :sswitch_7
    const v7, 0xdc01

    goto :goto_2

    :sswitch_8
    const/16 v7, 0x6ba5

    :goto_2
    const-string v13, "\u05ab\u05a8"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2d31

    const v15, -0x76c264a0

    xor-int/2addr v14, v15

    const v15, 0x301ececf

    goto/16 :goto_0

    :sswitch_9
    add-int v13, v2, v6

    mul-int v13, v13, v13

    sub-int v13, v5, v13

    if-ltz v13, :cond_2

    const-string v13, "\u06df\u05a8"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3d95

    const v15, 0x634ac063

    xor-int/2addr v14, v15

    const v15, 0x2fc3292a

    goto/16 :goto_0

    :cond_2
    const-string v13, "\u1a7b\u0736"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x7f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x6b0f

    const v15, 0x5b907248

    xor-int/2addr v14, v15

    const v15, 0x3f198771

    goto/16 :goto_0

    :sswitch_a
    const/16 v6, 0x1e75

    .line 2
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v13

    if-nez v13, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v13, "\u05ab\u06da"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2bf1

    const v15, -0x5594645

    xor-int/2addr v14, v15

    const v15, -0x8a02a9a

    goto/16 :goto_0

    :sswitch_b
    add-int v5, v3, v4

    add-int/2addr v5, v5

    sget v13, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v13, :cond_4

    goto :goto_3

    :cond_4
    const-string v13, "\u06df\u06df"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x57c3

    const v15, -0x38abf9d3

    xor-int/2addr v14, v15

    const v15, 0x57d8908e

    goto/16 :goto_0

    :sswitch_c
    mul-int v3, v2, v2

    const v4, 0x39fa179

    sget v13, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v13, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v13, "\u06da\u1a73"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x35

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x334b

    const v15, 0x5822e9cb    # 7.165001E14f

    xor-int/2addr v14, v15

    const v15, 0x49524a53

    goto/16 :goto_0

    :cond_6
    const-string v13, "\u073f\u06e1"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3a6b

    const v15, -0x52109a99

    xor-int/2addr v14, v15

    const v15, -0x1b5ef577

    goto/16 :goto_0

    :sswitch_d
    const/4 v1, 0x0

    .line 1
    sget v13, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v13, :cond_7

    :goto_3
    const-string v13, "\u06d6\u1a7b"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x47f7

    const v15, -0x53faf453

    xor-int/2addr v14, v15

    const v15, 0x7b412bda

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u073d\u1a7a"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x243b

    const v15, 0x54f7d4c9

    xor-int/2addr v14, v15

    const v15, -0x5f1238c6

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v13, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v13, :cond_9

    :cond_8
    const-string v13, "\u1a7b\u1a76"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x5f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x193d

    const v15, -0x1d15fc5d    # -2.1584001E21f

    xor-int/2addr v14, v15

    const v15, 0x2fd8c766

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u06dc\u0736"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x5d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x616f

    const v15, -0x60634278

    xor-int/2addr v14, v15

    const v15, -0x509e0c5f

    goto/16 :goto_0

    .line 3
    :sswitch_f
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v13

    if-eqz v13, :cond_a

    goto :goto_4

    :cond_a
    const-string v13, "\u1a77\u05a8"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x378b

    const v15, 0x10a9b93d

    xor-int/2addr v14, v15

    const v15, 0xee9fd0c

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v13, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v13, :cond_c

    :cond_b
    :goto_4
    const-string v13, "\u0730\u05a8"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0xf

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x6c01

    const v15, 0x7bc18989

    xor-int/2addr v14, v15

    const v15, 0x408f0a9d

    goto/16 :goto_0

    :cond_c
    const-string v13, "\u06e2\u06d9"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x3d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x4e05

    const v15, -0x2e881411

    xor-int/2addr v14, v15

    const v15, -0x482264c3

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    sget v13, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v13, :cond_d

    :goto_5
    const-string v13, "\u06dc\u06d9"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x47

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1193

    const v15, 0x78163a14

    xor-int/2addr v14, v15

    const v15, -0x7ccc0987

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u06da\u06da"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x25

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2bd9

    const v15, -0x580015ab

    xor-int/2addr v14, v15

    const v15, 0x6459810e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x793a9fd6 -> :sswitch_9
        -0x78919af9 -> :sswitch_9
        -0x7731e37f -> :sswitch_3
        -0x70e57807 -> :sswitch_6
        -0x6f38f018 -> :sswitch_8
        -0x6b6f141b -> :sswitch_c
        -0x60bb31ba -> :sswitch_b
        -0x536c31ac -> :sswitch_10
        -0x4ee405e9 -> :sswitch_8
        -0x4d233b8a -> :sswitch_10
        -0x3d7b7a97 -> :sswitch_b
        -0x3bbac62c -> :sswitch_4
        -0x38d1bc0c -> :sswitch_f
        -0x34e1d8f4 -> :sswitch_d
        -0x32be89a7 -> :sswitch_4
        -0x2da2f189 -> :sswitch_3
        -0x28682496 -> :sswitch_e
        -0x27e9e4cb -> :sswitch_2
        -0x1e622795 -> :sswitch_0
        -0x19e62561 -> :sswitch_11
        -0x183dca79 -> :sswitch_11
        -0xe1a5ccf -> :sswitch_6
        -0x36c8944 -> :sswitch_a
        0xa5eb77 -> :sswitch_d
        0x27e94d80 -> :sswitch_a
        0x33b905a7 -> :sswitch_f
        0x3853fd93 -> :sswitch_5
        0x51893a8e -> :sswitch_7
        0x5a8ae19b -> :sswitch_2
        0x5f7cea3d -> :sswitch_5
        0x6546c691 -> :sswitch_c
        0x680d4704 -> :sswitch_7
        0x6b3e00d6 -> :sswitch_1
        0x734b3d8f -> :sswitch_1
        0x79152163 -> :sswitch_0
        0x7edbc1f3 -> :sswitch_e
    .end sparse-switch
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    .line 70
    invoke-static {}, Ll/᩷᩹ۘ;->ۨ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageCountry()Ljava/lang/String;
    .locals 1

    .line 80
    invoke-static {}, Ll/᩷᩹ۘ;->ۖ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageNameLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 1

    .line 161
    invoke-static {}, Ll/᩷᩹ۘ;->ۚ()Lbin/mt/plugin/api/LocalString;

    move-result-object v0

    return-object v0
.end method

.method public final getLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 1

    .line 143
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getPluginId()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x26f92eb0

    sget v11, Ll/ۧ;->֫۠ᩴ:I

    sget v12, Ll/֨ۧ;->֫۠֡:I

    const-string v13, "\u1a7a\u06d7"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x2d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x40e5

    const v15, 0x7c198f88

    xor-int/2addr v14, v15

    const v15, -0x3ec176cd

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x2bf3

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    sget-object v8, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    const/16 v9, 0x9

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v13

    if-eqz v13, :cond_1

    goto/16 :goto_4

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    sget v13, Ll/֨ۧ;->֫۠֡:I

    if-lez v13, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v13, "\u06e0\u06e8"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x57

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0xc49

    const v15, 0x2147a403

    xor-int/2addr v14, v15

    const v15, 0x620b6a77

    goto :goto_0

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    sget v13, Ll/֫֡;->ۡ᩹ۗ:I

    if-lez v13, :cond_7

    goto/16 :goto_5

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v13

    if-gez v13, :cond_9

    goto/16 :goto_5

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    goto/16 :goto_5

    .line 4
    :sswitch_4
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v0, 0x14

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/֫ܽ;->ᩴ᩸ۗ([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v13, "\u1a77\u06e1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x29

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xd69

    const v15, -0x61cc89f5

    xor-int/2addr v14, v15

    const v15, -0x7a625ace

    goto :goto_0

    :sswitch_6
    const/16 v7, 0x58cd

    goto :goto_1

    :sswitch_7
    const/16 v7, 0x4a9a

    :goto_1
    const-string v13, "\u05a1\u06e1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1b57

    const v15, 0x78185f84

    xor-int/2addr v14, v15

    const v15, 0x5ae0c39a

    goto/16 :goto_0

    :sswitch_8
    mul-int v13, v6, v6

    sub-int/2addr v13, v4

    if-gez v13, :cond_2

    const-string v13, "\u1a75\u06dc"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x63

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x47f

    const v15, -0x20afe550

    xor-int/2addr v14, v15

    const v15, 0x6b9688d4

    goto/16 :goto_0

    :cond_2
    const-string v13, "\u1a76\u1a7b"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x4b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7635

    const v15, -0x2c0eefc1

    xor-int/2addr v14, v15

    const v15, 0x2fdee402

    goto/16 :goto_0

    :sswitch_9
    add-int v6, v2, v5

    .line 0
    sget v13, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v13, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v13, "\u05a1\u06d7"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x12f7

    const v15, 0x61b9a654

    xor-int/2addr v14, v15

    const v15, 0xa322bc6

    goto/16 :goto_0

    :sswitch_a
    mul-int v4, v2, v3

    const/16 v5, 0x2cb1

    .line 1
    sget-boolean v13, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v13, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v13, "\u0736\u06eb"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0xc07

    const v15, -0x259f4c3a

    xor-int/2addr v14, v15

    const v15, -0x2bc028a6

    goto/16 :goto_0

    :sswitch_b
    aget-short v2, v0, v1

    const v3, 0xb2c4

    sget-boolean v13, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v13, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v13, "\u05a1\u1a79"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x2b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4d21

    const v15, 0x5d07b2be

    xor-int/2addr v14, v15

    const v15, -0x1438ca85

    goto/16 :goto_0

    :sswitch_c
    const/16 v1, 0x8

    sget v13, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v13, :cond_6

    goto :goto_3

    :cond_6
    const-string v13, "\u06e8\u06dc"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x5d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2965

    const v15, 0x3ce41e8f

    xor-int/2addr v14, v15

    const v15, -0x46a3947b

    goto/16 :goto_0

    :sswitch_d
    sget v13, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v13, :cond_8

    :cond_7
    :goto_2
    const-string v13, "\u06e8\u06e4"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x7b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x25ef

    const v15, 0x24abe19f

    xor-int/2addr v14, v15

    const v15, -0x53e0f01a

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u06e8\u1a76"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3c71

    const v15, 0x47d13c1f

    xor-int/2addr v14, v15

    const v15, 0x471113bc

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget v13, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v13, :cond_a

    :cond_9
    :goto_3
    const-string v13, "\u06e1\u06ec"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x336d

    const v15, -0x1988731f

    xor-int/2addr v14, v15

    const v15, -0x13d33e8b

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06da\u06d7"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0xd

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7cc5

    const v15, 0x17d41bf3

    xor-int/2addr v14, v15

    const v15, 0x785f1bd0

    goto/16 :goto_0

    :sswitch_f
    sget v13, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v13, :cond_b

    goto :goto_5

    :cond_b
    const-string v13, "\u06df\u06e0"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x1d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7f3

    const v15, 0x49222e67

    xor-int/2addr v14, v15

    const v15, 0x2a2bf404

    goto/16 :goto_0

    .line 2
    :sswitch_10
    sget-boolean v13, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v13, :cond_c

    :goto_4
    const-string v13, "\u1a7a\u06e7"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6051

    const v15, 0x10a87fef

    xor-int/2addr v14, v15

    const v15, 0x14fcb310

    goto/16 :goto_0

    :cond_c
    const-string v13, "\u1a79\u1a76"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x67

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2005

    const v15, -0x6f10c097

    xor-int/2addr v14, v15

    const v15, -0x2cbacf48

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    .line 1
    sget v13, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v13, :cond_d

    :goto_5
    const-string v13, "\u073d\u1a78"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3b63

    const v15, -0x58985170

    xor-int/2addr v14, v15

    const v15, 0x4197130b

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u0733\u06d6"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2ecb

    const v15, -0x178813b1

    xor-int/2addr v14, v15

    const v15, -0x49d7fee8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f6f7f42 -> :sswitch_3
        -0x7444063e -> :sswitch_6
        -0x68607eff -> :sswitch_10
        -0x5f1df475 -> :sswitch_a
        -0x57fc8271 -> :sswitch_5
        -0x54048b2a -> :sswitch_0
        -0x4e7ce7bf -> :sswitch_9
        -0x4dd6f2c4 -> :sswitch_2
        -0x4da53579 -> :sswitch_7
        -0x4cf95375 -> :sswitch_b
        -0x358d6deb -> :sswitch_11
        -0x2ff01c86 -> :sswitch_f
        -0x2368df06 -> :sswitch_6
        -0x234708fd -> :sswitch_f
        -0x1dcd4ecf -> :sswitch_5
        -0x15a6881f -> :sswitch_0
        -0xbd1051d -> :sswitch_c
        -0x7eae0a7 -> :sswitch_c
        -0x18c6ed6 -> :sswitch_a
        0x92c1b70 -> :sswitch_10
        0x96efc77 -> :sswitch_9
        0xf53d821 -> :sswitch_1
        0xf622841 -> :sswitch_8
        0x242bc0be -> :sswitch_4
        0x274f1cf2 -> :sswitch_7
        0x2a5229dd -> :sswitch_b
        0x3528614d -> :sswitch_e
        0x40edcb4c -> :sswitch_d
        0x4be9b09c -> :sswitch_2
        0x52dde3ad -> :sswitch_d
        0x5328e135 -> :sswitch_3
        0x5560af0d -> :sswitch_11
        0x61e95747 -> :sswitch_1
        0x6f8eb7fe -> :sswitch_8
        0x74f13d08 -> :sswitch_4
        0x76ac715a -> :sswitch_e
    .end sparse-switch
.end method

.method public final getPluginName()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x7ed69ad1

    sget v11, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v12, Ll/֡֡;->᩶ۤ۠:I

    const-string v13, "\u1a74\u1a73"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x589b

    const v15, 0x6fa13b8e

    xor-int/2addr v14, v15

    const v15, 0x5555e471

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x64e1

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    const v7, 0xb31f

    goto :goto_1

    .line 4
    :sswitch_0
    sget v13, Ll/֫۟;->᩸ᩴܿ:I

    if-gez v13, :cond_3

    goto/16 :goto_3

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v13

    if-gtz v13, :cond_c

    goto/16 :goto_2

    .line 2
    :sswitch_2
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    sget v13, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v13, :cond_6

    goto/16 :goto_3

    .line 0
    :sswitch_3
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v0, 0x6

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/֡᩶;->ۢۖ۟([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v8, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    const/16 v9, 0x1e

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v13

    if-gtz v13, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v13, "\u1a75\u0733"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x244d

    const v15, -0x6c17483a

    xor-int/2addr v14, v15

    const v15, 0x7c5a8fc2

    goto :goto_0

    :sswitch_7
    const/16 v7, 0x719c

    :goto_1
    const-string v13, "\u06e8\u1a78"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x77

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x76b7

    const v15, 0x20e06c44

    xor-int/2addr v14, v15

    const v15, -0x2db6191

    goto :goto_0

    :sswitch_8
    add-int v13, v5, v6

    add-int/2addr v13, v13

    sub-int v13, v4, v13

    if-gtz v13, :cond_1

    const-string v13, "\u06e2\u06eb"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x287f

    const v15, 0x21f1e32c

    xor-int/2addr v14, v15

    const v15, 0x77a649ce

    goto/16 :goto_0

    :cond_1
    const-string v13, "\u06eb\u06dc"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x57

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2039

    const v15, 0x63292a7c

    xor-int/2addr v14, v15

    const v15, -0x40a64443

    goto/16 :goto_0

    :sswitch_9
    const v6, 0x135c7d71

    .line 1
    sget-boolean v13, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v13, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v13, "\u06eb\u05a8"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7141

    const v15, 0x6cb9431a

    xor-int/2addr v14, v15

    const v15, 0xfdb3190

    goto/16 :goto_0

    :sswitch_a
    mul-int v4, v3, v3

    mul-int v5, v2, v2

    sget v13, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v13, :cond_4

    :cond_3
    const-string v13, "\u06df\u073d"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x7b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5551

    const v15, 0x5ef2d7e3

    xor-int/2addr v14, v15

    const v15, 0x5f95a71b

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u1a73\u06dc"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x580f

    const v15, 0x48747635

    xor-int/2addr v14, v15

    const v15, 0x52f29cd1

    goto/16 :goto_0

    :sswitch_b
    add-int/lit16 v3, v2, 0x4667

    .line 2
    sget v13, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v13, :cond_5

    const-string v13, "\u05ab\u1a7a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x27

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x54c3

    const v15, 0x755626f1

    xor-int/2addr v14, v15

    const v15, -0x19f3ce09

    goto/16 :goto_0

    :cond_5
    const-string v13, "\u1a73\u1a79"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x35

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1197

    const v15, -0x6f48d9bd

    xor-int/2addr v14, v15

    const v15, 0x2393efd0

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    .line 1
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v13

    if-eqz v13, :cond_7

    :cond_6
    :goto_2
    const-string v13, "\u06e8\u1a7a"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1361

    const v15, 0x625e946f

    xor-int/2addr v14, v15

    const v15, 0x3774132e

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u06da\u06e7"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x31cf

    const v15, -0x420d858

    xor-int/2addr v14, v15

    const v15, -0x45ae8454

    goto/16 :goto_0

    :sswitch_d
    const/16 v1, 0x1d

    sget v13, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v13, :cond_8

    goto :goto_3

    :cond_8
    const-string v13, "\u06d8\u06df"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x14e9

    const v15, -0x15253dcc

    xor-int/2addr v14, v15

    const v15, -0x613db627

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget-boolean v13, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v13, :cond_9

    :goto_3
    const-string v13, "\u06dc\u05a8"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0xf

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5afb

    const v15, -0x4ec06e97

    xor-int/2addr v14, v15

    const v15, 0x42f3e114

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u1a7a\u06e7"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5e23

    const v15, 0x712d3fc4

    xor-int/2addr v14, v15

    const v15, 0x36218c18

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v13, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v13, :cond_a

    goto :goto_4

    :cond_a
    const-string v13, "\u06d6\u1a77"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x34f9

    const v15, -0x4e2a4769

    xor-int/2addr v14, v15

    const v15, 0x1d327037

    goto/16 :goto_0

    .line 4
    :sswitch_10
    sget v13, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v13, :cond_b

    goto :goto_4

    :cond_b
    const-string v13, "\u06d8\u06d9"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x349b

    const v15, -0x50d30b4c

    xor-int/2addr v14, v15

    const v15, 0x442aeef8

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    sget v13, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v13, :cond_d

    :cond_c
    :goto_4
    const-string v13, "\u06ec\u1a78"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x500f

    const v15, -0x2856ed95

    xor-int/2addr v14, v15

    const v15, -0x3b8ea4e3

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u073a\u0733"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7e37

    const v15, 0x142127dd

    xor-int/2addr v14, v15

    const v15, 0x7d3d2ad4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72253065 -> :sswitch_1
        -0x6c5b8818 -> :sswitch_6
        -0x646e69f2 -> :sswitch_2
        -0x5d9c3917 -> :sswitch_7
        -0x2d17f4c3 -> :sswitch_c
        -0x236d16b7 -> :sswitch_b
        -0x233768f3 -> :sswitch_0
        -0x1b1f8b30 -> :sswitch_6
        -0x1a4e6302 -> :sswitch_b
        -0x11971bfd -> :sswitch_5
        -0x4d12763 -> :sswitch_a
        -0x1210dd0 -> :sswitch_11
        0x4526782 -> :sswitch_10
        0x800ac1a -> :sswitch_f
        0xab69611 -> :sswitch_11
        0x12f41884 -> :sswitch_c
        0x1474fad8 -> :sswitch_7
        0x1edb3ffb -> :sswitch_9
        0x2125c5d5 -> :sswitch_9
        0x22ddf1f2 -> :sswitch_10
        0x231aa5b7 -> :sswitch_4
        0x28f7591e -> :sswitch_4
        0x2c779780 -> :sswitch_a
        0x2f5d7e75 -> :sswitch_2
        0x30732d7f -> :sswitch_5
        0x43f1746e -> :sswitch_8
        0x45b5e07f -> :sswitch_f
        0x482d2f69 -> :sswitch_e
        0x497d7455 -> :sswitch_8
        0x4fc6b600 -> :sswitch_1
        0x511807b5 -> :sswitch_e
        0x5ba22883 -> :sswitch_d
        0x62fe9962 -> :sswitch_3
        0x69c28baa -> :sswitch_d
        0x7b5e7a5f -> :sswitch_3
        0x7c52959b -> :sswitch_0
    .end sparse-switch
.end method

.method public final getPluginSdkVersion()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final getPluginVersionCode()I
    .locals 1

    .line 40
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getPluginVersionName()Ljava/lang/String;
    .locals 1

    .line 45
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 65
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, 0x558605fe

    sget v10, Ll/۟;->ۨᩴۛ:I

    sget v11, Ll/֡֡;->᩶ۤ۠:I

    const-string v12, "\u1a74\u073f"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x16ab

    const v14, -0x16a0a984

    xor-int/2addr v13, v14

    const v14, -0x287a1ed4

    :goto_0
    xor-int/2addr v12, v14

    :goto_1
    xor-int/2addr v9, v10

    mul-int/lit16 v9, v9, 0x7e25

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    .line 115
    new-instance v12, Ljava/lang/IllegalArgumentException;

    sget-object v13, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    .line 3
    sget v14, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v14, :cond_3

    goto :goto_2

    .line 23
    :sswitch_0
    sget v12, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v12, :cond_0

    goto :goto_4

    :cond_0
    move-object/from16 v13, p1

    goto/16 :goto_6

    .line 112
    :sswitch_1
    sget-boolean v12, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v12, :cond_1

    goto :goto_4

    :cond_1
    :goto_2
    move-object/from16 v13, p1

    goto/16 :goto_7

    .line 93
    :sswitch_2
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v12

    if-eqz v12, :cond_2

    goto :goto_4

    :cond_2
    :goto_3
    move-object/from16 v13, p1

    goto/16 :goto_8

    .line 85
    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    :goto_4
    const-string v12, "\u06d6\u06d9"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0x79

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x6c77

    const v14, 0x5e96a5ea

    xor-int/2addr v13, v14

    const v14, -0x215064f5

    goto :goto_0

    .line 37
    :sswitch_4
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    const/4 v0, 0x0

    :sswitch_5
    return-object v0

    :cond_3
    const/16 v14, 0x25

    .line 73
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v15

    if-ltz v15, :cond_4

    goto :goto_3

    :cond_4
    const/16 v15, 0x12

    .line 32
    sget v16, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v16, :cond_5

    goto :goto_2

    .line 115
    :cond_5
    invoke-static {v13, v14, v15, v8}, Ll/ۗᩳ;->ۖ᩶۫([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v13, p1

    invoke-static {v0, v13}, Ll/ۘ֡;->ۤ֨᩶(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v12

    :sswitch_6
    move-object/from16 v13, p1

    .line 113
    invoke-static/range {p0 .. p1}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v12, "\u073d\u0730"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0x3

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x12af

    const v15, 0x1d56430f

    xor-int/2addr v14, v15

    const v15, -0x56dcd4bd

    goto/16 :goto_9

    :cond_6
    const-string v12, "\u05a1\u06d9"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x5d51

    const v15, -0x41ca993c

    xor-int/2addr v14, v15

    const v15, 0x59f56f62

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v13, p1

    const/16 v8, 0x382c

    goto :goto_5

    :sswitch_8
    move-object/from16 v13, p1

    const/16 v8, 0x5e96

    :goto_5
    const-string v12, "\u1a73\u073a"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0x5b

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x28b1

    const v15, 0x59448ae1

    xor-int/2addr v14, v15

    const v15, -0x7b56554a

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v13, p1

    add-int v12, v6, v7

    sub-int v12, v5, v12

    if-lez v12, :cond_7

    const-string v12, "\u073d\u06e7"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x7e77

    const v15, 0x5f55385f

    xor-int/2addr v14, v15

    const v15, 0x7403fd27

    goto/16 :goto_9

    :cond_7
    const-string v12, "\u06e0\u06d7"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x21

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0xd9b

    const v15, -0x75ff7458

    xor-int/2addr v14, v15

    const v15, 0x52f88f91

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v13, p1

    const v7, 0x14d100

    sget-boolean v12, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v12, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v12, "\u06d9\u06eb"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x44f3

    const v15, -0x3ee6f2cf

    xor-int/2addr v14, v15

    const v15, 0x10f8c73b

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v13, p1

    mul-int v5, v3, v4

    mul-int v6, v3, v3

    .line 95
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v12

    if-ltz v12, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v12, "\u073f\u1a7b"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x1f2b

    const v15, -0x736e1500

    xor-int/2addr v14, v15

    const v15, -0x5a82df8d

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v13, p1

    aget-short v3, v1, v2

    const/16 v4, 0x920

    .line 44
    sget v12, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v12, :cond_a

    const-string v12, "\u06ec\u073f"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x5d

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x5323

    const v15, 0x65152b32

    xor-int/2addr v14, v15

    const v15, -0x3d66a073

    goto/16 :goto_9

    :cond_a
    const-string v12, "\u073a\u06e8"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x4ed1

    const v15, 0x132fef43

    xor-int/2addr v14, v15

    const v15, 0x67cc03c8

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v13, p1

    const/16 v2, 0x24

    .line 22
    sget v12, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v12, :cond_b

    goto/16 :goto_8

    :cond_b
    const-string v12, "\u1a7a\u0730"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0xf

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x7fef

    const v15, 0x3c9c4e4f

    xor-int/2addr v14, v15

    const v15, -0x4552e6db

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v13, p1

    sget-object v1, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    .line 37
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v12

    if-gtz v12, :cond_c

    :goto_6
    const-string v12, "\u06d6\u1a74"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, 0x29

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x2363

    const v15, -0x5072a7f2

    xor-int/2addr v14, v15

    const v15, 0xc8452f

    goto/16 :goto_9

    :cond_c
    const-string v12, "\u1a7a\u0736"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x79

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0xd6f

    const v15, -0x74b16adb

    xor-int/2addr v14, v15

    const v15, 0x37bd6021

    goto :goto_9

    :sswitch_f
    move-object/from16 v13, p1

    .line 62
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v12

    if-nez v12, :cond_d

    :goto_7
    const-string v12, "\u0736\u06eb"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x6929

    const v15, -0x76ca68cf

    xor-int/2addr v14, v15

    const v15, -0x29ec4db7

    goto :goto_9

    :cond_d
    const-string v12, "\u1a7a\u1a73"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x647f

    const v15, 0x70dbfb99

    xor-int/2addr v14, v15

    const v15, 0x5c27ced5

    goto :goto_9

    :sswitch_10
    move-object/from16 v13, p1

    .line 14
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v12

    if-gtz v12, :cond_e

    :goto_8
    const-string v12, "\u06d9\u06ec"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x287d

    const v15, 0x55fa5ef8

    xor-int/2addr v14, v15

    const v15, -0x1127ff71

    goto :goto_9

    :cond_e
    const-string v12, "\u1a73\u073f"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x4d

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x2731

    const v15, -0x5fcd5828

    xor-int/2addr v14, v15

    const v15, -0x414d4032

    :goto_9
    xor-int/2addr v12, v15

    move v13, v14

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ef91db1 -> :sswitch_2
        -0x7c75f4fb -> :sswitch_8
        -0x7902046c -> :sswitch_8
        -0x69bf2b3d -> :sswitch_e
        -0x65c63221 -> :sswitch_2
        -0x6453bc7c -> :sswitch_10
        -0x4e6f5248 -> :sswitch_b
        -0x4a837eb4 -> :sswitch_0
        -0x3b1b8ab7 -> :sswitch_c
        -0x37ef3f7a -> :sswitch_d
        -0x31b56687 -> :sswitch_f
        -0x2563b6da -> :sswitch_9
        -0x24cfc62a -> :sswitch_1
        -0x21057a0f -> :sswitch_9
        -0x1baae4d5 -> :sswitch_10
        -0x1b921550 -> :sswitch_a
        -0x1225f3e6 -> :sswitch_6
        -0xe9b05d1 -> :sswitch_e
        -0x9f2cc89 -> :sswitch_5
        0x21da4681 -> :sswitch_4
        0x24bc8e93 -> :sswitch_3
        0x28a8f7ab -> :sswitch_d
        0x2be67cc5 -> :sswitch_b
        0x3829838e -> :sswitch_7
        0x4591507f -> :sswitch_5
        0x4958a016 -> :sswitch_3
        0x577baa4d -> :sswitch_f
        0x66a26792 -> :sswitch_c
        0x69233256 -> :sswitch_1
        0x69b00e5d -> :sswitch_0
        0x6f198e40 -> :sswitch_a
        0x6f80c3d8 -> :sswitch_4
        0x7679e424 -> :sswitch_6
        0x7f416b67 -> :sswitch_7
    .end sparse-switch
.end method

.method public final varargs getString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    const v0, 0x314908a6

    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v2, Ll/֫ᩳ;->۬֨᩸:I

    const-string v3, "\u06db\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x79ed

    const v5, 0x3e569419

    xor-int/2addr v4, v5

    const v5, -0x3037d91d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x4eb5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_5

    .line 76
    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_3

    .line 116
    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v3

    if-gtz v3, :cond_8

    goto/16 :goto_4

    .line 35
    :sswitch_2
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v3, :cond_a

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    :goto_1
    const-string v3, "\u05a8\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x73a5

    const v5, 0x6c953dd

    xor-int/2addr v4, v5

    const v5, 0x77f4994c

    goto :goto_0

    .line 37
    :sswitch_4
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    const/4 p1, 0x0

    return-object p1

    .line 123
    :sswitch_5
    invoke-virtual {p0, p1}, Ll/ܽ֨ۘ;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ۧ֨ۘ;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v3, "\u06e0\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x45fd

    const v5, -0x3c9be72e

    xor-int/2addr v4, v5

    const v5, -0x5deec3fb

    goto :goto_0

    .line 15
    :sswitch_6
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a76\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x57cb

    const v5, 0x78c0d634

    xor-int/2addr v4, v5

    const v5, -0x54bb546d

    goto :goto_0

    .line 92
    :sswitch_7
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u06df\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5dfd

    const v5, -0x1a0bb7ff

    xor-int/2addr v4, v5

    const v5, 0x74ed9571

    goto/16 :goto_0

    .line 23
    :sswitch_8
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a75\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4a89

    const v5, 0x391ab61a

    xor-int/2addr v4, v5

    const v5, -0x25e923fc

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u06e1\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2713

    const v5, -0x5df4a6cb

    xor-int/2addr v4, v5

    const v5, -0x6f124920

    goto/16 :goto_0

    .line 64
    :sswitch_a
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v3

    if-eqz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u06ec\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4937

    const v5, -0x341ff3f9    # -2.9366286E7f

    xor-int/2addr v4, v5

    const v5, 0x469b47eb

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e4\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x28ab

    const v5, 0x3bf180dc

    xor-int/2addr v4, v5

    const v5, -0x78b1a6cf

    goto/16 :goto_0

    .line 21
    :sswitch_b
    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u06e2\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x20a1

    const v5, -0x62652d50

    xor-int/2addr v4, v5

    const v5, -0x2c113189

    goto/16 :goto_0

    .line 36
    :sswitch_c
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u1a77\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x33e3

    const v5, -0x755dfd4d

    xor-int/2addr v4, v5

    const v5, -0x6028dc19

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e0\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xee9

    const v5, -0x664e26ad

    xor-int/2addr v4, v5

    const v5, 0x30493543

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06e0\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x60cf

    const v5, 0x7a45e20e

    xor-int/2addr v4, v5

    const v5, -0x6291b5d4

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06d7\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6bd7

    const v5, 0x2530d1af

    xor-int/2addr v4, v5

    const v5, 0x29d0d1b7

    goto/16 :goto_0

    .line 9
    :sswitch_e
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_c

    :goto_5
    const-string v3, "\u06d7\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2453

    const v5, -0x603c69f0

    xor-int/2addr v4, v5

    const v5, 0x4bb53ce7    # 2.3755214E7f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d8\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x27ff

    const v5, -0x355182d9    # -5717651.5f

    xor-int/2addr v4, v5

    const v5, 0x18e738d2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ca2658f -> :sswitch_4
        -0x78902fd9 -> :sswitch_5
        -0x638424ac -> :sswitch_9
        -0x61177cdc -> :sswitch_e
        -0x52773dd1 -> :sswitch_d
        -0x47ef59f6 -> :sswitch_3
        -0x4555d088 -> :sswitch_2
        -0x3d1708b1 -> :sswitch_8
        -0x3b26d9c6 -> :sswitch_2
        -0x2b93e5f3 -> :sswitch_0
        -0x2538e5fa -> :sswitch_3
        -0x23ce84f6 -> :sswitch_e
        -0x23966afe -> :sswitch_7
        -0x238a2221 -> :sswitch_b
        -0x1eaac7f9 -> :sswitch_5
        -0x96fe987 -> :sswitch_a
        0x44a1515 -> :sswitch_0
        0xcae3c99 -> :sswitch_c
        0x19c2c0ff -> :sswitch_a
        0x26a3be0c -> :sswitch_c
        0x26e8d4ce -> :sswitch_6
        0x2b091efe -> :sswitch_1
        0x2c1a2e1e -> :sswitch_6
        0x2ea7809f -> :sswitch_4
        0x3055d73d -> :sswitch_9
        0x3229cc2b -> :sswitch_8
        0x32457de0 -> :sswitch_1
        0x4ae27e56 -> :sswitch_d
        0x53f24243 -> :sswitch_7
        0x6c28f1c6 -> :sswitch_b
    .end sparse-switch
.end method

.method public final varargs getStringArray([Ljava/lang/String;)[Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x584315b7

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v4, Ll/֨ۧ;->֫۠֡:I

    const-string v5, "\u06e0\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4185

    const v7, -0x50394df

    xor-int/2addr v6, v7

    const v7, 0x3aca594b

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x8ff

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 20
    sget v5, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v5, :cond_7

    goto/16 :goto_3

    .line 53
    :sswitch_0
    sget v5, Ll/֫᩺;->᩺۟ۘ:I

    if-lez v5, :cond_6

    goto :goto_1

    .line 37
    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_1
    const-string v5, "\u1a7a\u06dc"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5459

    const v7, -0x52ef6b84

    xor-int/2addr v6, v7

    const v7, -0x1647225e

    goto :goto_0

    .line 17
    :sswitch_2
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v5

    if-lez v5, :cond_c

    goto/16 :goto_5

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 135
    :sswitch_6
    aput-object v1, p1, v0

    .line 121
    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u1a75\u06da"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7129

    const v7, 0x2ada8c89

    xor-int/2addr v6, v7

    const v7, 0x11e571a7

    goto :goto_0

    .line 135
    :sswitch_7
    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, Ll/ܽ֨ۘ;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 119
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u06e1\u1a74"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x9b9

    const v7, 0xe4e58de

    xor-int/2addr v6, v7

    const v7, -0x75563f4

    goto/16 :goto_0

    :sswitch_8
    return-object p1

    .line 134
    :sswitch_9
    array-length v5, p1

    if-ge v0, v5, :cond_3

    const-string v5, "\u1a78\u0736"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2bb5

    const v7, -0x7e2edfa0

    xor-int/2addr v6, v7

    const v7, 0xb4bd56f

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06e7\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7a6f

    const v7, 0x1c9a96ae

    xor-int/2addr v6, v7

    const v7, -0x2aaa292b

    goto/16 :goto_0

    :sswitch_a
    const/4 v0, 0x0

    :goto_2
    const-string v5, "\u06ec\u06df"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x36bb

    const v7, 0x16708d44

    xor-int/2addr v6, v7

    const v7, 0x41f2da33

    goto/16 :goto_0

    .line 104
    :sswitch_b
    sget-boolean v5, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v5, :cond_4

    goto :goto_4

    :cond_4
    const-string v5, "\u1a7b\u06e2"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x51

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x38fd

    const v7, -0x7af19f46

    xor-int/2addr v6, v7

    const v7, 0x2a7adaf6

    goto/16 :goto_0

    .line 22
    :sswitch_c
    sget v5, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v5, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v5, "\u06e0\u1a7b"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x63

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x367f

    const v7, 0x20e1371c

    xor-int/2addr v6, v7

    const v7, -0x481a0fc5

    goto/16 :goto_0

    :cond_6
    :goto_3
    const-string v5, "\u1a76\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xd

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x475b

    const v7, -0x25320a33

    xor-int/2addr v6, v7

    const v7, -0x64d41f44

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06d9\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4991

    const v7, -0x2f4df77b

    xor-int/2addr v6, v7

    const v7, 0x25bff0df

    goto/16 :goto_0

    .line 32
    :sswitch_d
    sget-boolean v5, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v5, :cond_8

    :goto_4
    const-string v5, "\u06dc\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3add

    const v7, -0xef3627

    xor-int/2addr v6, v7

    const v7, 0x2678df78

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e1\u06e7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x59

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xaef

    const v7, 0x204de781

    xor-int/2addr v6, v7

    const v7, 0x3e7e8fd2

    goto/16 :goto_0

    .line 45
    :sswitch_e
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v5

    if-ltz v5, :cond_9

    goto :goto_5

    :cond_9
    const-string v5, "\u1a77\u073a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x3b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6dd7

    const v7, 0x5234dd28

    xor-int/2addr v6, v7

    const v7, 0x36db9b50

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_5

    :cond_a
    const-string v5, "\u06e7\u06eb"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2185

    const v7, -0x29ca06c1

    xor-int/2addr v6, v7

    const v7, -0x6e43e0cd

    goto/16 :goto_0

    .line 58
    :sswitch_10
    sget v5, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v5, :cond_b

    :goto_5
    const-string v5, "\u1a76\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7719

    const v7, -0xdae3e5b

    xor-int/2addr v6, v7

    const v7, 0x49d2930b

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06d6\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x74d7

    const v7, 0x11d272c5

    xor-int/2addr v6, v7

    const v7, -0x5b1f051a

    goto/16 :goto_0

    .line 8
    :sswitch_11
    sget-boolean v5, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v5, :cond_d

    :cond_c
    :goto_6
    const-string v5, "\u073f\u06eb"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3753

    const v7, -0x42489247

    xor-int/2addr v6, v7

    const v7, 0x314f5bfa

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a77\u073d"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x75eb

    const v7, -0x4715f09e

    xor-int/2addr v6, v7

    const v7, 0x3e28fcef

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d2f535b -> :sswitch_e
        -0x73f83092 -> :sswitch_2
        -0x62b5b875 -> :sswitch_10
        -0x4b473333 -> :sswitch_3
        -0x47994086 -> :sswitch_11
        -0x47455699 -> :sswitch_d
        -0x3db9b84c -> :sswitch_2
        -0x3540d0be -> :sswitch_e
        -0x2497ffcd -> :sswitch_f
        -0x222bbb9b -> :sswitch_6
        -0x1b7404ec -> :sswitch_4
        -0x17e735f7 -> :sswitch_0
        -0x16accbc5 -> :sswitch_1
        -0x168dba7d -> :sswitch_b
        -0x12f80f02 -> :sswitch_11
        -0x116c4183 -> :sswitch_9
        -0xf748e91 -> :sswitch_f
        -0x870b0f9 -> :sswitch_a
        -0x61d9746 -> :sswitch_d
        -0x1db8a15 -> :sswitch_8
        -0x182e991 -> :sswitch_10
        0x103aa1be -> :sswitch_b
        0x14318bac -> :sswitch_3
        0x242957b1 -> :sswitch_0
        0x291dc631 -> :sswitch_7
        0x30a31e9e -> :sswitch_a
        0x34987d78 -> :sswitch_5
        0x400302cb -> :sswitch_c
        0x40a5c6c1 -> :sswitch_4
        0x412f2456 -> :sswitch_5
        0x57f7321c -> :sswitch_c
        0x648c309a -> :sswitch_9
        0x6708d599 -> :sswitch_8
        0x6ef4c7bf -> :sswitch_7
        0x74c371b4 -> :sswitch_6
        0x7cb937d4 -> :sswitch_1
    .end sparse-switch
.end method

.method public final varargs getStringList([Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 129
    invoke-virtual {p0, p1}, Ll/ܽ֨ۘ;->getStringArray([Ljava/lang/String;)[Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getStringNullable(Ljava/lang/String;)Ljava/lang/String;
    .locals 26

    move-object/from16 v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

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

    const v17, 0x1386690d

    sget v18, Ll/֫ۚ;->ܽ۠᩹:I

    sget v19, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v20, "\u05ab\u073a"

    invoke-static/range {v20 .. v20}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v19

    mul-int/lit8 v20, v20, 0xf

    xor-int v1, v20, v18

    mul-int/lit16 v1, v1, 0xc53

    const v22, -0x16e5d644

    xor-int v1, v1, v22

    const v22, 0x6670798e

    xor-int v20, v20, v22

    move-object v4, v3

    move-object/from16 v10, v16

    move/from16 v21, v20

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const v20, 0x1386690d

    const/16 v22, 0x0

    move-object/from16 v16, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v12, v20, v18

    mul-int/lit16 v12, v12, 0x57c5

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v1, v12

    xor-int v20, v21, v1

    sparse-switch v20, :sswitch_data_0

    move/from16 v21, v11

    move/from16 v23, v13

    const/16 v1, 0x38

    const/4 v11, 0x4

    .line 100
    invoke-static {v10, v1, v11, v9}, Ll/۟;->ܳܳ᩶([SIII)Ljava/lang/String;

    move-result-object v1

    .line 101
    invoke-static {v7, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "\u0736\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x3d

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x51dd

    const v12, 0x2b83a623

    xor-int/2addr v11, v12

    const v12, 0xd606df1

    goto/16 :goto_e

    :sswitch_0
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v1, :cond_0

    goto :goto_4

    :cond_0
    move/from16 v21, v11

    move/from16 v23, v13

    goto/16 :goto_c

    .line 132
    :sswitch_1
    sget-boolean v1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v1, :cond_2

    :cond_1
    move/from16 v21, v11

    move/from16 v23, v13

    goto/16 :goto_d

    :cond_2
    move/from16 v21, v11

    :goto_1
    move/from16 v23, v13

    goto/16 :goto_7

    .line 20
    :sswitch_2
    sget v1, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v1, :cond_1

    goto :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v1

    if-eqz v1, :cond_3

    :goto_2
    move/from16 v21, v11

    :goto_3
    move/from16 v23, v13

    goto/16 :goto_b

    :cond_3
    :goto_4
    const-string v1, "\u06df\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v12, v1, v18

    mul-int/lit16 v12, v12, -0x29a5

    const v21, 0x7a5c51cb

    xor-int v12, v12, v21

    const v21, -0x553dc2f5

    :goto_5
    xor-int v21, v1, v21

    move v1, v12

    goto :goto_0

    .line 72
    :sswitch_4
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    goto :goto_2

    .line 94
    :sswitch_5
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    const/4 v0, 0x0

    return-object v0

    .line 0
    :sswitch_6
    invoke-static {v3, v3, v0}, Ll/᩷ۘᩳ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v4, v1

    move/from16 v21, v11

    move/from16 v23, v13

    goto/16 :goto_8

    .line 46
    :sswitch_7
    new-instance v1, Ll/֡֨ۘ;

    sget-object v12, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    move/from16 v21, v11

    .line 91
    sget v23, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v23, :cond_4

    goto :goto_3

    :cond_4
    const/4 v11, 0x7

    .line 50
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v24

    if-gtz v24, :cond_5

    goto :goto_1

    :cond_5
    move/from16 v23, v13

    const/16 v13, 0x3c

    .line 46
    invoke-static {v12, v13, v11, v9}, Ll/֡ܳ;->ܶۘۙ([SIII)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v1, v11}, Ll/֡֨ۘ;-><init>(Ljava/lang/String;)V

    sput-object v1, Ll/᩷᩹ۘ;->ܰ:Ll/֡֨ۘ;

    goto :goto_6

    .line 48
    :sswitch_8
    sget-object v0, Ll/᩷᩹ۘ;->ܰ:Ll/֡֨ۘ;

    .line 97
    invoke-virtual {v0, v4, v6}, Ll/֡֨ۘ;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 161
    :sswitch_9
    invoke-static {}, Ll/᩷᩹ۘ;->ۚ()Lbin/mt/plugin/api/LocalString;

    move-result-object v0

    .line 102
    check-cast v0, Ll/֡֨ۘ;

    invoke-virtual {v0, v8, v6}, Ll/֡֨ۘ;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_a
    return-object v6

    :sswitch_b
    move/from16 v21, v11

    move/from16 v23, v13

    .line 0
    invoke-static {v3, v0}, Ll/֡۠;->ۡܰ۫(ILjava/lang/Object;)C

    move-result v1

    const/16 v11, 0x7d

    if-ne v1, v11, :cond_c

    const-string v1, "\u05a1\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x351f

    const v12, -0x66369e55

    xor-int/2addr v11, v12

    const v12, -0x363e68c7

    goto/16 :goto_e

    :sswitch_c
    move/from16 v21, v11

    move/from16 v23, v13

    .line 45
    sget-object v1, Ll/᩷᩹ۘ;->ܰ:Ll/֡֨ۘ;

    if-nez v1, :cond_6

    const-string v1, "\u06e8\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x9

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x647b

    const v12, -0x19e5d1d6

    xor-int/2addr v11, v12

    const v12, 0x17c1c72a

    goto/16 :goto_e

    :cond_6
    :goto_6
    const-string v1, "\u05ab\u06d8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x4b

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x51cf

    const v12, 0x6a3c6737

    xor-int/2addr v11, v12

    const v12, -0x75a901d6

    goto/16 :goto_e

    :cond_7
    const-string v1, "\u0733\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x3ae9

    const v12, 0x21e68ce2

    xor-int/2addr v11, v12

    const v12, 0x45ae57bc

    goto/16 :goto_e

    :sswitch_d
    move/from16 v21, v11

    move/from16 v23, v13

    .line 100
    sget-object v10, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    .line 119
    sget-boolean v1, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v1, :cond_8

    :goto_7
    const-string v1, "\u06dc\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x596f

    const v12, -0x1bfec38e

    xor-int/2addr v11, v12

    const v12, -0x2f20393a

    goto/16 :goto_e

    :cond_8
    const-string v1, "\u06e7\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x51

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x4029

    const v12, 0x160a2456

    xor-int/2addr v11, v12

    const v12, -0x66eaa083

    goto/16 :goto_e

    :sswitch_e
    move/from16 v21, v11

    move/from16 v23, v13

    .line 99
    invoke-static {v4, v2, v5}, Ll/ۘۛ;->ۖ᩸᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v7

    add-int v1, v5, v3

    .line 100
    invoke-static {v4, v1}, Ll/֨᩸;->᩷᩷ۛ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v8

    .line 50
    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v1, :cond_9

    goto/16 :goto_c

    :cond_9
    const-string v1, "\u1a74\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x49bd

    const v12, 0x3b15f302

    xor-int/2addr v11, v12

    const v12, -0x6acc9684

    goto/16 :goto_e

    :sswitch_f
    move/from16 v21, v11

    move/from16 v23, v13

    .line 91
    invoke-static {v0, v2}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v1

    const/16 v11, 0x7b

    if-ne v1, v11, :cond_c

    const-string v1, "\u06e2\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x6569

    const v12, 0x28a5516c

    xor-int/2addr v11, v12

    const v12, 0x51bb93e3

    goto/16 :goto_e

    :sswitch_10
    move/from16 v21, v11

    move/from16 v23, v13

    const/16 v1, 0x3a

    .line 94
    invoke-static {v4, v1}, Ll/ۗܺ;->᩻᩷ܶ(Ljava/lang/Object;I)I

    move-result v5

    const/4 v1, -0x1

    const/4 v6, 0x0

    if-ne v5, v1, :cond_a

    const-string v1, "\u1a79\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x27

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x61f9

    const v12, -0x6ec2d2df

    xor-int/2addr v11, v12

    const v12, 0x1f974ec6

    goto/16 :goto_e

    :cond_a
    const-string v1, "\u06d6\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x61

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x6723

    const v12, 0x121d50cb

    xor-int/2addr v11, v12

    const v12, -0x606a86f8

    goto/16 :goto_e

    :sswitch_11
    move/from16 v21, v11

    move/from16 v23, v13

    .line 91
    invoke-static/range {p1 .. p1}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v11, 0x1

    if-lt v1, v2, :cond_b

    const-string v1, "\u06ec\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x11

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0xd53

    const v12, -0x647d1f8b

    xor-int/2addr v2, v12

    const v12, 0x2af89ca4

    xor-int/2addr v1, v12

    move/from16 v11, v21

    move/from16 v13, v23

    const/4 v3, 0x1

    move/from16 v21, v1

    move v1, v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_b
    const/4 v2, 0x0

    const/4 v3, 0x1

    :cond_c
    move-object v4, v0

    :goto_8
    const-string v1, "\u1a78\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x1df3

    const v12, -0x2b54c86c

    xor-int/2addr v11, v12

    const v12, 0x60c134ed

    goto/16 :goto_e

    :sswitch_12
    move/from16 v21, v11

    move/from16 v23, v13

    const v1, 0xa4e7

    const v9, 0xa4e7

    goto :goto_9

    :sswitch_13
    move/from16 v21, v11

    move/from16 v23, v13

    const v1, 0x8220

    const v9, 0x8220

    :goto_9
    const-string v1, "\u1a73\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x3209

    const v12, -0x285170ea

    xor-int/2addr v11, v12

    const v12, -0x3ada0e35

    goto/16 :goto_e

    :sswitch_14
    move/from16 v21, v11

    move/from16 v23, v13

    add-int/lit8 v1, v15, 0x1

    sub-int/2addr v1, v14

    if-gtz v1, :cond_d

    const-string v1, "\u06d7\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x4625

    const v12, 0x509a3223

    xor-int/2addr v11, v12

    const v12, -0x57204e45

    goto/16 :goto_e

    :cond_d
    const-string v1, "\u06e1\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x7b2b

    const v12, -0x6e1aa892

    xor-int/2addr v11, v12

    const v12, 0x69c5e7af

    goto/16 :goto_e

    :sswitch_15
    move/from16 v21, v11

    move/from16 v23, v13

    mul-int v14, v23, v23

    mul-int/lit8 v15, v21, 0x2

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v1

    if-eqz v1, :cond_e

    goto/16 :goto_c

    :cond_e
    const-string v1, "\u1a73\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x7af7

    const v12, -0x7bb38229

    xor-int/2addr v11, v12

    const v12, -0x6ce59b5b

    goto/16 :goto_e

    :sswitch_16
    move/from16 v21, v11

    add-int v13, v21, v22

    .line 15
    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v1, :cond_f

    move/from16 v11, v21

    goto :goto_a

    :cond_f
    const-string v1, "\u073d\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x68bd

    const v12, -0x59ed6f4e

    xor-int/2addr v11, v12

    const v12, -0x427f5418

    xor-int/2addr v1, v12

    goto/16 :goto_f

    :sswitch_17
    move/from16 v23, v13

    aget-short v11, v16, v17

    const/16 v22, 0x1

    .line 43
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v1

    if-nez v1, :cond_10

    move/from16 v13, v23

    :goto_a
    const-string v1, "\u1a75\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v12, v1, v18

    mul-int/lit16 v12, v12, -0xa2f

    const v21, 0x4a4c325a    # 3345558.5f

    xor-int v12, v12, v21

    const v21, -0x36ef8127

    goto/16 :goto_5

    :cond_10
    const-string v1, "\u1a76\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x41

    xor-int v12, v1, v18

    mul-int/lit16 v12, v12, -0x6055

    const v13, 0x6137cb30

    xor-int/2addr v12, v13

    const v13, 0x7dca2a08

    xor-int v21, v1, v13

    move v1, v12

    move/from16 v13, v23

    goto/16 :goto_0

    :sswitch_18
    move/from16 v21, v11

    move/from16 v23, v13

    const/16 v17, 0x37

    .line 89
    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v1, :cond_11

    :goto_b
    const-string v1, "\u06d6\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x3213

    const v12, 0x742eded5

    xor-int/2addr v11, v12

    const v12, -0x5e3ba423

    goto/16 :goto_e

    :cond_11
    const-string v1, "\u1a7a\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x3d

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x3815

    const v12, 0x9c1d182

    xor-int/2addr v11, v12

    const v12, -0x2d51fe00

    goto :goto_e

    :sswitch_19
    move/from16 v21, v11

    move/from16 v23, v13

    sget-object v16, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_12

    :goto_c
    const-string v1, "\u06d7\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x6b

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x74c5

    const v12, -0x4befc7b4

    xor-int/2addr v11, v12

    const v12, 0x1d509ea6

    goto :goto_e

    :cond_12
    const-string v1, "\u1a7b\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x52ed

    const v12, -0x78fdc6ea

    xor-int/2addr v11, v12

    const v12, 0x517623ac

    goto :goto_e

    :sswitch_1a
    move/from16 v21, v11

    move/from16 v23, v13

    sget-boolean v1, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v1, :cond_13

    :goto_d
    const-string v1, "\u06e7\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x79

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x2d6d

    const v12, 0x42a380ef

    xor-int/2addr v11, v12

    const v12, -0x73a175d1

    goto :goto_e

    :cond_13
    const-string v1, "\u06db\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x5711

    const v12, 0xb2cc4b2

    xor-int/2addr v11, v12

    const v12, -0x83f0ed5

    :goto_e
    xor-int/2addr v1, v12

    move/from16 v13, v23

    :goto_f
    move/from16 v25, v21

    move/from16 v21, v1

    move v1, v11

    move/from16 v11, v25

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79ed213e -> :sswitch_12
        -0x7912e0c6 -> :sswitch_1a
        -0x7588fe91 -> :sswitch_3
        -0x70ea5338 -> :sswitch_10
        -0x6b20cbcf -> :sswitch_19
        -0x678e4fc9 -> :sswitch_5
        -0x62c54da3 -> :sswitch_16
        -0x5e26392c -> :sswitch_f
        -0x5b605836 -> :sswitch_6
        -0x57ed5186 -> :sswitch_1
        -0x5586873c -> :sswitch_a
        -0x4ba9fbb5 -> :sswitch_e
        -0x49dcdc4e -> :sswitch_d
        -0x4193668f -> :sswitch_b
        -0x398c8dbe -> :sswitch_16
        -0x37c484ba -> :sswitch_15
        -0x32528fc5 -> :sswitch_0
        -0x2ed747a4 -> :sswitch_3
        -0x1a34a7fc -> :sswitch_13
        -0x175d9050 -> :sswitch_1
        -0x11e50281 -> :sswitch_18
        0x121edda -> :sswitch_9
        0xa629b68 -> :sswitch_17
        0xb30a22f -> :sswitch_d
        0xe318db4 -> :sswitch_c
        0xe6d2d39 -> :sswitch_a
        0xebf456d -> :sswitch_18
        0x114d8fc1 -> :sswitch_14
        0x1d4936f3 -> :sswitch_11
        0x2380bd12 -> :sswitch_15
        0x2474543e -> :sswitch_1a
        0x24b3d716 -> :sswitch_12
        0x27fce83e -> :sswitch_8
        0x31b03933 -> :sswitch_8
        0x34c21758 -> :sswitch_4
        0x35c02333 -> :sswitch_c
        0x36df9af4 -> :sswitch_13
        0x3840a5d6 -> :sswitch_f
        0x3f08cbff -> :sswitch_2
        0x419a42bc -> :sswitch_e
        0x46c9b1fa -> :sswitch_4
        0x47283472 -> :sswitch_10
        0x4e135622 -> :sswitch_5
        0x54ef0785 -> :sswitch_9
        0x5713b463 -> :sswitch_0
        0x57871c6b -> :sswitch_2
        0x57c1d2a1 -> :sswitch_6
        0x5b263ab2 -> :sswitch_11
        0x662e7cfa -> :sswitch_7
        0x69c0db50 -> :sswitch_19
        0x70782ff8 -> :sswitch_7
        0x71670e68 -> :sswitch_b
        0x79ef14b7 -> :sswitch_17
        0x7cce88a8 -> :sswitch_14
    .end sparse-switch
.end method

.method public final hasClipboardText()Z
    .locals 1

    .line 186
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final log(Ljava/lang/String;)V
    .locals 0

    .line 234
    invoke-static {p1}, Ll/᩷᩹ۘ;->ۙ(Ljava/lang/String;)V

    return-void
.end method

.method public final log(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 18

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x31765ae1

    sget v11, Ll/ۖܽ;->ܳ۠᩹:I

    sget v12, Ll/֡ܳ;->֡۠ۧ:I

    const-string v13, "\u073a\u06e8"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x759f

    const v15, 0x231326f7

    xor-int/2addr v14, v15

    const v15, 0x6b22c53b

    :goto_0
    xor-int/2addr v13, v15

    :goto_1
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x3dc7

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    .line 14
    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v1, :cond_9

    goto/16 :goto_9

    :sswitch_0
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget v13, Ll/ۖۗ;->᩶۫ۗ:I

    if-gez v13, :cond_1

    :cond_0
    :goto_2
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v16, v3

    goto/16 :goto_6

    :cond_1
    const-string v13, "\u06d6\u1a79"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x3

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2e93

    const v15, -0x722898c

    xor-int/2addr v14, v15

    const v15, -0x734cd0e8

    goto :goto_0

    .line 88
    :sswitch_1
    sget v13, Ll/֡ۛ;->۬᩸ܶ:I

    if-nez v13, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    goto/16 :goto_c

    .line 75
    :sswitch_2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget v13, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v13, :cond_0

    :goto_3
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    :goto_4
    move/from16 v17, v1

    goto/16 :goto_b

    .line 37
    :sswitch_3
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    goto :goto_3

    .line 60
    :sswitch_4
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    return-void

    .line 0
    :sswitch_5
    invoke-static {v7, v8, v9, v6}, Ll/ۖܽ;->᩸ᩴ᩵([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    .line 155
    invoke-static {v0, v13, v14}, Ll/᩷᩹ۘ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :sswitch_6
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    .line 0
    sget-object v7, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    const/16 v9, 0x14

    .line 34
    sget v15, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v15, :cond_3

    move/from16 v16, v3

    const/16 v8, 0x44

    goto/16 :goto_a

    :cond_3
    const-string v15, "\u1a74\u06db"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    mul-int/lit8 v15, v15, 0x27

    xor-int v8, v15, v11

    mul-int/lit16 v8, v8, 0x3969

    const v17, 0x7dca2e20

    xor-int v8, v8, v17

    const v17, 0x6779f457

    xor-int v15, v15, v17

    move v14, v8

    move v13, v15

    const/16 v8, 0x44

    goto/16 :goto_1

    :sswitch_7
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    const/16 v6, 0x1679

    goto :goto_5

    :sswitch_8
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    const/16 v6, 0x551a

    :goto_5
    const-string v15, "\u05ab\u073a"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move/from16 v16, v6

    xor-int v6, v15, v11

    mul-int/lit16 v6, v6, -0x158d

    const v17, 0x67545b83

    xor-int v6, v6, v17

    const v17, 0x34136867

    xor-int v15, v15, v17

    move v14, v6

    move v13, v15

    move/from16 v6, v16

    goto/16 :goto_1

    :sswitch_9
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    add-int v15, v4, v5

    add-int/2addr v15, v15

    sub-int/2addr v15, v3

    if-gez v15, :cond_4

    const-string v15, "\u05a1\u0733"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v11

    move/from16 v16, v3

    xor-int v3, v15, v12

    mul-int/lit16 v3, v3, 0x7a19

    const v17, -0x1feb6189

    xor-int v3, v3, v17

    const v17, -0x3f62da3d

    xor-int v15, v15, v17

    move v14, v3

    move v13, v15

    goto/16 :goto_8

    :cond_4
    move/from16 v16, v3

    const-string v3, "\u06d8\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v11

    mul-int/lit8 v3, v3, 0x6f

    xor-int v15, v3, v12

    mul-int/lit16 v15, v15, 0x1b57

    const v17, 0x37cbb833

    xor-int v15, v15, v17

    const v17, -0x448aa194

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v16, v3

    const v5, 0x120ef004

    .line 35
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_5

    :goto_6
    const-string v3, "\u06ec\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v12

    xor-int v15, v3, v11

    mul-int/lit16 v15, v15, -0x3451

    const v17, -0xd9b584f

    xor-int v15, v15, v17

    const v17, -0x1179a0e

    goto :goto_7

    :cond_5
    const-string v3, "\u06e0\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v12

    xor-int v15, v3, v11

    mul-int/lit16 v15, v15, 0x5fe1

    const v17, -0x42018654

    xor-int v15, v15, v17

    const v17, -0x3f634690

    goto :goto_7

    :sswitch_b
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    add-int v3, v1, v2

    mul-int v3, v3, v3

    mul-int v4, v1, v1

    sget v15, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v15, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v15, "\u05a1\u0736"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move/from16 v17, v1

    xor-int v1, v15, v11

    mul-int/lit16 v1, v1, -0x3535

    const v16, -0x794110ea

    xor-int v1, v1, v16

    const v16, -0x62d25c25

    xor-int v15, v15, v16

    move v14, v1

    move v13, v15

    goto/16 :goto_e

    :sswitch_c
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v16, v3

    const/16 v1, 0x43

    aget-short v1, v0, v1

    const/16 v2, 0x43fe

    .line 151
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v3

    if-eqz v3, :cond_7

    goto/16 :goto_a

    :cond_7
    const-string v3, "\u06ec\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v11

    mul-int/lit8 v3, v3, 0x25

    xor-int v15, v3, v12

    mul-int/lit16 v15, v15, -0x657d

    const v17, 0xba03d4e    # 6.1722E-32f

    xor-int v15, v15, v17

    const v17, -0x6b0eab96

    :goto_7
    xor-int v3, v3, v17

    move v13, v3

    move v14, v15

    :goto_8
    move/from16 v3, v16

    goto/16 :goto_1

    :sswitch_d
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    sget-object v0, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v1

    if-eqz v1, :cond_8

    :goto_9
    move/from16 v1, v17

    goto :goto_a

    :cond_8
    const-string v1, "\u06ec\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v12, v1

    mul-int/lit8 v1, v1, -0x79

    xor-int v3, v1, v11

    mul-int/lit16 v3, v3, -0xc61

    const v15, 0xc808935

    xor-int/2addr v3, v15

    const v15, 0x7cc2fa9

    goto/16 :goto_d

    :cond_9
    const-string v1, "\u1a76\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v11

    mul-int/lit8 v1, v1, -0x67

    xor-int v3, v1, v12

    mul-int/lit16 v3, v3, -0x1a37

    const v15, 0x3c202bb

    xor-int/2addr v3, v15

    const v15, 0x535eb61f

    goto/16 :goto_d

    :sswitch_e
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    .line 132
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_9

    :cond_a
    const-string v1, "\u06df\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v12

    xor-int v3, v1, v11

    mul-int/lit16 v3, v3, 0x443d

    const v15, 0xe24fad0

    xor-int/2addr v3, v15

    const v15, 0x7e6c9517

    goto/16 :goto_d

    :sswitch_f
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    .line 144
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v1

    if-gtz v1, :cond_b

    goto :goto_9

    :goto_a
    const-string v3, "\u1a75\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v11

    xor-int v15, v3, v12

    mul-int/lit16 v15, v15, -0x4f43

    const v17, -0x41332c83    # -0.40005103f

    xor-int v15, v15, v17

    const v17, -0x21e453d6

    goto/16 :goto_7

    :cond_b
    const-string v1, "\u1a7a\u1a77"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v11

    xor-int v3, v1, v12

    mul-int/lit8 v3, v3, -0x5f

    const v15, 0xb42dc2e

    xor-int/2addr v3, v15

    const v15, -0x55c227b1

    goto/16 :goto_d

    :sswitch_10
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v1, :cond_c

    move/from16 v3, v16

    :goto_b
    const-string v1, "\u073a\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v11

    mul-int/lit8 v1, v1, -0x35

    xor-int v15, v1, v12

    mul-int/lit16 v15, v15, 0x182b

    const v16, 0x390663

    xor-int v15, v15, v16

    const v16, -0x642612bf

    xor-int v1, v1, v16

    move v13, v1

    move v14, v15

    goto :goto_e

    :cond_c
    const-string v1, "\u05a1\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v12

    mul-int/lit8 v1, v1, 0x47

    xor-int v3, v1, v11

    mul-int/lit16 v3, v3, 0x2461

    const v15, -0x582063eb

    xor-int/2addr v3, v15

    const v15, -0x294f7319

    goto :goto_d

    :sswitch_11
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    .line 143
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_c
    const-string v1, "\u1a77\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v11

    mul-int/lit8 v1, v1, -0x6f

    xor-int v3, v1, v12

    mul-int/lit16 v3, v3, -0x5389

    const v15, -0x67ab1564

    xor-int/2addr v3, v15

    const v15, 0x102f7a38

    goto :goto_d

    :cond_d
    const-string v1, "\u06db\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v11, v1

    mul-int/lit8 v1, v1, 0x1d

    xor-int v3, v1, v12

    mul-int/lit16 v3, v3, -0x469d

    const v15, 0x3164b342

    xor-int/2addr v3, v15

    const v15, -0x3b48a38f

    :goto_d
    xor-int/2addr v1, v15

    move v13, v1

    move v14, v3

    move/from16 v3, v16

    :goto_e
    move/from16 v1, v17

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7ad71f0b -> :sswitch_2
        -0x6b3aaffa -> :sswitch_9
        -0x681844ae -> :sswitch_1
        -0x67012b61 -> :sswitch_9
        -0x5efdb7e9 -> :sswitch_4
        -0x5975f120 -> :sswitch_3
        -0x4a5a12b8 -> :sswitch_e
        -0x486d185f -> :sswitch_b
        -0x44822f98 -> :sswitch_f
        -0x3e7c12e5 -> :sswitch_0
        -0x3ab05eb7 -> :sswitch_a
        -0x37d00fa8 -> :sswitch_0
        -0x2a0da4d5 -> :sswitch_7
        -0x2100cf90 -> :sswitch_10
        -0x20f915b5 -> :sswitch_7
        -0x12831145 -> :sswitch_d
        -0x10b9f133 -> :sswitch_4
        -0x10b12c66 -> :sswitch_6
        -0xb1178ba -> :sswitch_e
        -0x9a424f7 -> :sswitch_3
        0x569ed42 -> :sswitch_b
        0xfbdab68 -> :sswitch_8
        0x11a56c17 -> :sswitch_5
        0x1a9c1975 -> :sswitch_d
        0x1da45738 -> :sswitch_c
        0x30ae7367 -> :sswitch_a
        0x3c8dda0b -> :sswitch_11
        0x3e0c0fb8 -> :sswitch_c
        0x43864c3d -> :sswitch_5
        0x5034a2e4 -> :sswitch_10
        0x5523bf64 -> :sswitch_f
        0x5aa039be -> :sswitch_8
        0x5d2e6c60 -> :sswitch_2
        0x6c7169af -> :sswitch_6
        0x74b959ef -> :sswitch_11
        0x7a6bdb2c -> :sswitch_1
    .end sparse-switch
.end method

.method public final log(Ljava/lang/Throwable;)V
    .locals 18

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, -0x6c40e440

    sget v12, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v13, Ll/֡ۚ;->ۢܰ᩸:I

    const-string v14, "\u06e8\u06e1"

    invoke-static {v14}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x4fb1

    const v16, -0x48cae86f

    xor-int v15, v15, v16

    const v16, 0x38948a11

    xor-int v14, v14, v16

    :goto_0
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, -0x66dd

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    return-void

    .line 65
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v14

    if-gtz v14, :cond_1

    :cond_0
    move-object/from16 v14, p1

    move-object/from16 v17, v0

    move/from16 v16, v2

    goto/16 :goto_5

    :cond_1
    move-object/from16 v14, p1

    move/from16 v16, v2

    goto/16 :goto_3

    .line 153
    :sswitch_1
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v14

    if-lez v14, :cond_0

    :goto_1
    move-object/from16 v14, p1

    goto/16 :goto_4

    .line 20
    :sswitch_2
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v14

    if-lez v14, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v14, p1

    move/from16 v16, v2

    goto/16 :goto_6

    .line 102
    :sswitch_3
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    goto :goto_1

    .line 0
    :sswitch_4
    invoke-static {v8, v9, v10, v7}, Ll/֫֡;->֫֫֫([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v14, p1

    .line 163
    invoke-static {v0, v1, v14}, Ll/᩷᩹ۘ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :sswitch_5
    move-object/from16 v14, p1

    .line 150
    sget v15, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v15, :cond_3

    move/from16 v16, v2

    const/16 v10, 0x14

    goto/16 :goto_6

    :cond_3
    const-string v15, "\u06e0\u06e2"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v12, v15

    mul-int/lit8 v15, v15, -0x41

    xor-int v10, v15, v13

    mul-int/lit16 v10, v10, -0xa61

    const v17, -0x5ec21c57

    xor-int v10, v10, v17

    const v17, -0x7b864d4

    xor-int v15, v15, v17

    move v14, v15

    move v15, v10

    const/16 v10, 0x14

    goto :goto_0

    :sswitch_6
    move-object/from16 v14, p1

    .line 0
    sget-object v8, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v15

    if-eqz v15, :cond_4

    move/from16 v16, v2

    const/16 v9, 0x59

    goto/16 :goto_6

    :cond_4
    const-string v15, "\u06d8\u0733"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    mul-int/lit8 v15, v15, -0x2d

    xor-int v9, v15, v13

    mul-int/lit16 v9, v9, 0x6a09

    const v17, 0x59415808

    xor-int v9, v9, v17

    const v17, -0x434673c4

    xor-int v15, v15, v17

    move v14, v15

    move v15, v9

    const/16 v9, 0x59

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v14, p1

    const/16 v7, 0x3cce

    goto :goto_2

    :sswitch_8
    move-object/from16 v14, p1

    const/16 v7, 0x7aab

    :goto_2
    const-string v15, "\u073f\u1a73"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    move/from16 v16, v7

    xor-int v7, v15, v12

    mul-int/lit16 v7, v7, 0x7e3b

    const v17, -0x6682b584

    xor-int v7, v7, v17

    const v17, -0x1f00c297

    xor-int v15, v15, v17

    move v14, v15

    move v15, v7

    move/from16 v7, v16

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v14, p1

    add-int v15, v2, v6

    mul-int v15, v15, v15

    sub-int v15, v5, v15

    if-gez v15, :cond_5

    const-string v15, "\u1a76\u06d8"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move/from16 v16, v2

    xor-int v2, v15, v13

    mul-int/lit16 v2, v2, -0x773d

    const v17, -0x4babc61

    xor-int v2, v2, v17

    const v17, -0x3c95c3b3

    xor-int v15, v15, v17

    move v14, v15

    move v15, v2

    goto/16 :goto_8

    :cond_5
    move/from16 v16, v2

    const-string v2, "\u06e2\u06ec"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v13, v2

    mul-int/lit8 v2, v2, 0x49

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, -0x5039

    const v17, -0x4d5750bb

    xor-int v15, v15, v17

    const v17, -0x34bfdf83    # -1.2591229E7f

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v14, p1

    move/from16 v16, v2

    const/16 v6, 0x25cd

    .line 92
    sget v2, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v2, :cond_6

    :goto_3
    const-string v2, "\u06da\u1a7a"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x4d

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, 0x796d

    const v17, 0x38682393

    xor-int v15, v15, v17

    const v17, -0x1261d1f5

    goto/16 :goto_7

    :cond_6
    const-string v2, "\u1a78\u06db"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x5

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, -0x15ef

    const v17, 0x2484b314

    xor-int v15, v15, v17

    const v17, 0x3c614065

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v14, p1

    move/from16 v16, v2

    add-int v2, v3, v4

    add-int v5, v2, v2

    sget-boolean v2, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v2, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v2, "\u06ec\u06db"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x7ae9

    const v17, 0x5772f34b

    xor-int v15, v15, v17

    const v17, 0xa23f22e

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v14, p1

    move/from16 v16, v2

    const v4, 0x594e629

    .line 83
    sget-boolean v2, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v2, :cond_8

    move-object/from16 v17, v0

    goto/16 :goto_9

    :cond_8
    const-string v2, "\u05a8\u06eb"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x1b79

    const v17, 0x1ce64fe5

    xor-int v15, v15, v17

    const v17, 0x19d3853e

    goto/16 :goto_7

    :sswitch_d
    move-object/from16 v14, p1

    aget-short v2, v0, v1

    mul-int v3, v2, v2

    .line 115
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v15

    if-nez v15, :cond_9

    :goto_4
    const-string v15, "\u06dc\u06db"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v13, v15

    mul-int/lit8 v15, v15, 0x59

    move-object/from16 v17, v0

    xor-int v0, v15, v12

    mul-int/lit16 v0, v0, 0x78a5

    const v16, -0x547282a1

    xor-int v0, v0, v16

    const v16, 0x1b9ca346

    xor-int v15, v15, v16

    move v14, v15

    move v15, v0

    goto/16 :goto_b

    :cond_9
    move-object/from16 v17, v0

    const-string v0, "\u1a78\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x55

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x7793

    const v16, -0x80c0db6

    xor-int v15, v15, v16

    const v16, 0x6731eb19

    xor-int v0, v0, v16

    move v14, v0

    goto/16 :goto_b

    :sswitch_e
    move-object/from16 v14, p1

    move-object/from16 v17, v0

    move/from16 v16, v2

    const/16 v1, 0x58

    .line 55
    sget v0, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v0, :cond_a

    :goto_5
    const-string v0, "\u073d\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x4d

    xor-int v2, v0, v12

    mul-int/lit16 v2, v2, -0x5817

    const v15, 0xe7e9c65

    xor-int/2addr v15, v2

    const v2, 0x14935480

    goto/16 :goto_a

    :cond_a
    const-string v0, "\u073d\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v2, v0, v12

    mul-int/lit16 v2, v2, 0x4017

    const v15, 0x7e71f11f

    xor-int/2addr v15, v2

    const v2, 0x3dbc0baf

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v14, p1

    move/from16 v16, v2

    sget-object v0, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v2

    if-ltz v2, :cond_b

    :goto_6
    const-string v2, "\u1a74\u1a77"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    mul-int/lit8 v2, v2, -0x7b

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x456b

    const v17, 0x5049cf5d

    xor-int v15, v15, v17

    const v17, 0x70d0d046

    goto :goto_7

    :cond_b
    const-string v2, "\u1a73\u06eb"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x73b

    const v17, 0xbb248d2

    xor-int v15, v15, v17

    const v17, 0x15dfda5b

    :goto_7
    xor-int v2, v2, v17

    move v14, v2

    :goto_8
    move/from16 v2, v16

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v14, p1

    move-object/from16 v17, v0

    move/from16 v16, v2

    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_c

    goto :goto_9

    :cond_c
    const-string v0, "\u06df\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x19

    xor-int v2, v0, v12

    mul-int/lit16 v2, v2, 0x2b17

    const v15, 0x1f8d39d5

    xor-int/2addr v15, v2

    const v2, -0x2691fb09

    goto :goto_a

    :sswitch_11
    move-object/from16 v14, p1

    move-object/from16 v17, v0

    move/from16 v16, v2

    sget v0, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v0, :cond_d

    :goto_9
    const-string v0, "\u06e8\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, 0x7f9

    const v15, -0x29d19e10

    xor-int/2addr v15, v2

    const v2, -0x6e41de96    # -2.9997307E-28f

    goto :goto_a

    :cond_d
    const-string v0, "\u1a78\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, 0x7693

    const v15, -0x11c7491e

    xor-int/2addr v15, v2

    const v2, -0x4cb369ad

    :goto_a
    xor-int/2addr v0, v2

    move v14, v0

    move/from16 v2, v16

    :goto_b
    move-object/from16 v0, v17

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c93cafc -> :sswitch_4
        -0x74b332e0 -> :sswitch_3
        -0x741598a2 -> :sswitch_f
        -0x73999d85 -> :sswitch_3
        -0x69ce651b -> :sswitch_10
        -0x668a78c8 -> :sswitch_b
        -0x6520cd83 -> :sswitch_6
        -0x6206a2e0 -> :sswitch_e
        -0x6196c54e -> :sswitch_d
        -0x5543dc24 -> :sswitch_1
        -0x54cfe286 -> :sswitch_a
        -0x538ca240 -> :sswitch_2
        -0x4b3f3402 -> :sswitch_0
        -0x3626db7f -> :sswitch_0
        -0x34b6d599 -> :sswitch_5
        -0x3206f1b5 -> :sswitch_9
        -0x2cb14e71 -> :sswitch_2
        -0x2bf61e91 -> :sswitch_5
        -0x19e8cf4b -> :sswitch_7
        -0x159f233a -> :sswitch_1
        -0xb71a238 -> :sswitch_4
        0x16d28f4 -> :sswitch_c
        0xf53e195 -> :sswitch_9
        0x1dea6132 -> :sswitch_11
        0x26996260 -> :sswitch_f
        0x2f5d189b -> :sswitch_a
        0x30a2d759 -> :sswitch_e
        0x3a09162b -> :sswitch_c
        0x3b17904c -> :sswitch_d
        0x3cad04a7 -> :sswitch_b
        0x432a102e -> :sswitch_6
        0x55d3dfe4 -> :sswitch_8
        0x5e847cd3 -> :sswitch_11
        0x5fd21378 -> :sswitch_10
        0x714c1b6b -> :sswitch_7
        0x7cfb6cec -> :sswitch_8
    .end sparse-switch
.end method

.method public final openBrowser(Ljava/lang/String;)V
    .locals 0

    .line 176
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final openBuiltinBrowser(Ljava/lang/String;Z)V
    .locals 4

    const p1, -0xb738365

    sget p2, Ll/ۘۗ;->ۖۧ۬:I

    sget v0, Ll/֡ܳ;->֡۠ۧ:I

    const-string v1, "\u06e0\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x75

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x1541

    const v3, -0x196d269d

    xor-int/2addr v2, v3

    const v3, -0x1a7db03e

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x1149

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v1, :cond_c

    goto/16 :goto_4

    .line 141
    :sswitch_0
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v1, :cond_a

    goto/16 :goto_1

    .line 7
    :sswitch_1
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v1, :cond_5

    goto/16 :goto_1

    .line 145
    :sswitch_2
    sget v1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v1, :cond_7

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    return-void

    .line 181
    :sswitch_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :sswitch_6
    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u0730\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x55dd

    const v3, -0x5e50e8ce

    xor-int/2addr v2, v3

    const v3, -0x6944b939

    goto :goto_0

    .line 126
    :sswitch_7
    sget-boolean v1, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v1, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v1, "\u05a8\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x78bf

    const v3, -0x6e579cdf

    xor-int/2addr v2, v3

    const v3, -0x2b469646

    goto :goto_0

    .line 101
    :sswitch_8
    sget-boolean v1, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u06e0\u1a73"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x33

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x1e43

    const v3, -0x30032194

    xor-int/2addr v2, v3

    const v3, 0x7dc582bb

    goto/16 :goto_0

    :sswitch_9
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_3

    :goto_1
    const-string v1, "\u06df\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x659b

    const v3, -0x2a713c82

    xor-int/2addr v2, v3

    const v3, 0x4325e54c

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u06e7\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x2b

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x5507

    const v3, 0x2f4cab3

    xor-int/2addr v2, v3

    const v3, 0x18e7d38a

    goto/16 :goto_0

    .line 119
    :sswitch_a
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v1

    if-gtz v1, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v1, "\u05a8\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x6979

    const v3, 0x58d27670

    xor-int/2addr v2, v3

    const v3, -0x6aff38bc

    goto/16 :goto_0

    .line 44
    :sswitch_b
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_6

    :cond_5
    :goto_2
    const-string v1, "\u1a77\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x5591

    const v3, 0x6bca72bd

    xor-int/2addr v2, v3

    const v3, -0x37735bed

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e0\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x3d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x7c0d

    const v3, 0x77f808d

    xor-int/2addr v2, v3

    const v3, 0x652d29da

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v1, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v1, :cond_8

    :cond_7
    const-string v1, "\u073d\u06d8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0xa1b

    const v3, 0x2a04b516

    xor-int/2addr v2, v3

    const v3, -0x423da3a8

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06ec\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x4505

    const v3, 0x316a0abe

    xor-int/2addr v2, v3

    const v3, -0x1d643369

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v1, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v1, :cond_9

    goto :goto_3

    :cond_9
    const-string v1, "\u05a1\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x6973

    const v3, 0x2d47b2aa

    xor-int/2addr v2, v3

    const v3, 0x7f21819f

    goto/16 :goto_0

    .line 72
    :sswitch_e
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v1

    if-eqz v1, :cond_b

    :cond_a
    :goto_3
    const-string v1, "\u06ec\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x4f

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x56cb

    const v3, 0x4742f51c

    xor-int/2addr v2, v3

    const v3, 0x14e33fc

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06d7\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x1e65

    const v3, -0x547304e2

    xor-int/2addr v2, v3

    const v3, 0x6287d7bb

    goto/16 :goto_0

    :goto_4
    const-string v1, "\u06e7\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x4d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x130f

    const v3, 0x6ce6bd4f

    xor-int/2addr v2, v3

    const v3, -0x7c0b79a1

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06db\u05ab"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x147b

    const v3, 0x36f4f595

    xor-int/2addr v2, v3

    const v3, -0x4441d837

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6a9392d3 -> :sswitch_a
        -0x655d5aee -> :sswitch_8
        -0x620a83d7 -> :sswitch_2
        -0x5b3af72c -> :sswitch_b
        -0x5b350d9d -> :sswitch_4
        -0x5187487c -> :sswitch_a
        -0x2c7236a8 -> :sswitch_6
        -0x1c23b522 -> :sswitch_e
        -0x19add699 -> :sswitch_7
        -0x196a7bcd -> :sswitch_3
        -0x18378311 -> :sswitch_e
        -0x169a2387 -> :sswitch_0
        -0xad6d239 -> :sswitch_d
        0x115823c -> :sswitch_5
        0x2ae2fd4 -> :sswitch_9
        0x963d8dd -> :sswitch_0
        0x1914f94c -> :sswitch_c
        0x1abd7a1a -> :sswitch_5
        0x1b478e5c -> :sswitch_4
        0x271ce168 -> :sswitch_7
        0x274383d9 -> :sswitch_c
        0x285c8447 -> :sswitch_6
        0x2a6c9a20 -> :sswitch_3
        0x4710fe3f -> :sswitch_1
        0x4df107c0 -> :sswitch_d
        0x50a715db -> :sswitch_9
        0x5f21be12 -> :sswitch_2
        0x62834887 -> :sswitch_8
        0x692c82a3 -> :sswitch_1
        0x75353007 -> :sswitch_b
    .end sparse-switch
.end method

.method public final openLogViewer()V
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x4ba1477c    # 2.1139192E7f

    sget v9, Ll/ۖ᩸;->ۨܽ۬:I

    sget v10, Ll/ۗ;->֨۬ۖ:I

    const-string v11, "\u06e2\u073d"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x35b3

    const v13, 0x3064d298

    xor-int/2addr v12, v13

    const v13, 0x34311613

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x7aa1

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    const/16 v1, 0x6d

    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v11

    if-gtz v11, :cond_c

    goto/16 :goto_4

    .line 69
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v11

    if-gez v11, :cond_a

    goto :goto_1

    .line 468
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v11

    if-eqz v11, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v11, "\u1a73\u06e7"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x3

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x5f1d

    const v13, -0x7064404d

    xor-int/2addr v12, v13

    const v13, -0x5c1db06b

    goto :goto_0

    .line 454
    :sswitch_2
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v11

    if-nez v11, :cond_7

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    goto/16 :goto_4

    .line 250
    :sswitch_4
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    return-void

    .line 508
    :sswitch_5
    new-instance v11, Ll/᩺ܺۘ;

    const/4 v12, 0x1

    sget-boolean v13, Ll/᩶;->ۚۤۘ:Z

    if-eqz v13, :cond_1

    goto/16 :goto_3

    :cond_1
    sget-object v13, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    sget v14, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v14, :cond_2

    goto/16 :goto_3

    :cond_2
    const/16 v14, 0x6e

    .line 443
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v15

    if-nez v15, :cond_3

    goto/16 :goto_3

    :cond_3
    const/16 v15, 0x14

    .line 508
    invoke-static {v13, v14, v15, v7}, Ll/֡֡;->ۨܶ᩷([SIII)Ljava/lang/String;

    move-result-object v13

    .line 3
    sget-boolean v14, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v14, :cond_4

    goto/16 :goto_4

    .line 508
    :cond_4
    invoke-direct {v11, v13, v12}, Ll/᩺ܺۘ;-><init>(Ljava/lang/String;I)V

    invoke-static {v11}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_6
    const v7, 0xde84

    goto :goto_2

    :sswitch_7
    const v7, 0x962c

    :goto_2
    const-string v11, "\u1a76\u06d6"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x39ad

    const v13, 0x6b5baaa1

    xor-int/2addr v12, v13

    const v13, 0x76624e26

    goto/16 :goto_0

    :sswitch_8
    add-int v11, v5, v6

    add-int/2addr v11, v11

    sub-int/2addr v11, v4

    if-gez v11, :cond_5

    const-string v11, "\u06e4\u06d6"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x29

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x3a79

    const v13, -0x69b62a35

    xor-int/2addr v12, v13

    const v13, -0x7c85d305

    goto/16 :goto_0

    :cond_5
    const-string v11, "\u06dc\u1a73"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x75

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x10ef

    const v13, -0x2cb1d40a

    xor-int/2addr v12, v13

    const v13, -0x6361bfa5

    goto/16 :goto_0

    :sswitch_9
    const v6, 0x10018009

    .line 108
    sget v11, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v11, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v11, "\u06df\u1a79"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x2cdb

    const v13, -0x5034bee8

    xor-int/2addr v12, v13

    const v13, -0x50796e0c

    goto/16 :goto_0

    :sswitch_a
    mul-int v4, v3, v3

    mul-int v5, v2, v2

    .line 111
    sget v11, Ll/֫;->ܶܺ᩻:I

    if-ltz v11, :cond_8

    :cond_7
    :goto_3
    const-string v11, "\u073f\u06d9"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0xb4d

    const v13, -0x157ba80a    # -7.99968E25f

    xor-int/2addr v12, v13

    const v13, -0x59d2667c

    goto/16 :goto_0

    :cond_8
    const-string v11, "\u1a75\u1a7a"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x51

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x23c3

    const v13, -0x7f135907

    xor-int/2addr v12, v13

    const v13, -0x72f408a6

    goto/16 :goto_0

    :sswitch_b
    add-int/lit16 v3, v2, 0x4003

    .line 285
    sget v11, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v11, :cond_9

    const-string v11, "\u0733\u06dc"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x4aa7

    const v13, 0x70bbd149

    xor-int/2addr v12, v13

    const v13, -0x53c0fe49

    goto/16 :goto_0

    :cond_9
    const-string v11, "\u05ab\u06d7"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x875

    const v13, 0x732df387

    xor-int/2addr v12, v13

    const v13, -0x115f2eb

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    .line 506
    sget v11, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v11, :cond_b

    :cond_a
    const-string v11, "\u073f\u1a75"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3a53

    const v13, -0x5badb9d

    xor-int/2addr v12, v13

    const v13, 0x3273eb2e

    goto/16 :goto_0

    :cond_b
    const-string v11, "\u06e7\u06e4"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x3851

    const v13, 0x5f022f9a

    xor-int/2addr v12, v13

    const v13, -0x4c69e530

    goto/16 :goto_0

    :cond_c
    const-string v11, "\u1a74\u1a7a"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x25

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x135b

    const v13, -0x74574060    # -6.499957E-32f

    xor-int/2addr v12, v13

    const v13, -0x50211e30

    goto/16 :goto_0

    :sswitch_d
    sget-object v0, Ll/ܽ֨ۘ;->ۙ֫ᩴ:[S

    .line 463
    sget v11, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v11, :cond_d

    :goto_4
    const-string v11, "\u06da\u073a"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x5b07

    const v13, 0xbdad141

    xor-int/2addr v12, v13

    const v13, -0x50e01fc6

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u0733\u06e4"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x55

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x4c09

    const v13, 0x7ef28a78

    xor-int/2addr v12, v13

    const v13, -0x4b70b6e4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f7cfd4c -> :sswitch_1
        -0x793e27fc -> :sswitch_d
        -0x788889fd -> :sswitch_5
        -0x5c706030 -> :sswitch_5
        -0x54bda78e -> :sswitch_7
        -0x48eb62e0 -> :sswitch_8
        -0x44db3743 -> :sswitch_2
        -0x2c67ed60 -> :sswitch_a
        -0x29dd8082 -> :sswitch_3
        -0x299828c4 -> :sswitch_6
        -0x1ef55291 -> :sswitch_d
        -0xffce5fc -> :sswitch_0
        -0xadac0cc -> :sswitch_2
        -0x1fd15f8 -> :sswitch_b
        0x120a37db -> :sswitch_9
        0x1def2916 -> :sswitch_4
        0x24ccbf95 -> :sswitch_7
        0x3fa59d07 -> :sswitch_6
        0x41bc6f73 -> :sswitch_1
        0x4c1aa915 -> :sswitch_a
        0x511aa7ee -> :sswitch_c
        0x5411b467 -> :sswitch_9
        0x6156de7d -> :sswitch_4
        0x66782cdb -> :sswitch_b
        0x72f3e64a -> :sswitch_c
        0x73c39428 -> :sswitch_3
        0x79d10d68 -> :sswitch_0
        0x7a689458 -> :sswitch_8
    .end sparse-switch
.end method

.method public final openPreference(Ljava/lang/Class;)V
    .locals 0

    .line 171
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 197
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 4

    const p1, 0x3b5369da

    sget p2, Ll/ۖ᩸;->ۨܽ۬:I

    sget v0, Ll/ۘۧ;->ܳ᩷᩸:I

    const-string v1, "\u1a73\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x627b

    const v3, 0x4ef64940

    xor-int/2addr v2, v3

    const v3, 0x5ba600b5

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0x16d5

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    .line 23
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v1

    if-ltz v1, :cond_4

    goto/16 :goto_2

    .line 42
    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v1

    if-eqz v1, :cond_b

    goto/16 :goto_4

    .line 97
    :sswitch_1
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v1

    if-eqz v1, :cond_6

    goto/16 :goto_4

    .line 85
    :sswitch_2
    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_8

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    goto :goto_1

    .line 161
    :sswitch_4
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    const/4 p1, 0x0

    return p1

    .line 202
    :sswitch_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :sswitch_6
    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v1, "\u06eb\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x39

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x38a5

    const v3, -0x933e245

    xor-int/2addr v2, v3

    const v3, -0x5b8cb72c

    goto :goto_0

    :sswitch_7
    sget v1, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u06df\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x45

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0xb0f

    const v3, -0x4ddb3d36

    xor-int/2addr v2, v3

    const v3, 0x59f60dbc

    goto :goto_0

    .line 7
    :sswitch_8
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v1

    if-gtz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "\u06ec\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x13ff

    const v3, -0x23d16bee

    xor-int/2addr v2, v3

    const v3, -0x19adc3ce

    goto/16 :goto_0

    .line 73
    :sswitch_9
    sget v1, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v1, :cond_3

    :goto_1
    const-string v1, "\u1a7b\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x65

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x3e4b

    const v3, 0x4c9d828a    # 8.258056E7f

    xor-int/2addr v2, v3

    const v3, 0x175cef5

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u06e1\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x43

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x31ff

    const v3, -0x31107373

    xor-int/2addr v2, v3

    const v3, 0x2a48aaa6

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06db\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, 0x39

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x1145

    const v3, -0xb2df05a

    xor-int/2addr v2, v3

    const v3, -0x61e58c3c

    goto/16 :goto_0

    .line 130
    :sswitch_a
    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v1, :cond_5

    :goto_2
    const-string v1, "\u06e2\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x69

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x6747

    const v3, -0x3eeac771

    xor-int/2addr v2, v3

    const v3, 0x10ea03fb

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e8\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x47df

    const v3, -0x7c469368

    xor-int/2addr v2, v3

    const v3, 0x6deaca3a

    goto/16 :goto_0

    :sswitch_b
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_7

    :cond_6
    :goto_3
    const-string v1, "\u1a7b\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x65

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x6153

    const v3, -0x32a9e302

    xor-int/2addr v2, v3

    const v3, 0x6ed0c269

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u05a1\u06d8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x7f

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x5caf

    const v3, 0x16f5da25

    xor-int/2addr v2, v3

    const v3, -0x504c8151

    goto/16 :goto_0

    :sswitch_c
    sget v1, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v1, :cond_9

    :cond_8
    :goto_4
    const-string v1, "\u1a76\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1b

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x410d

    const v3, 0x20744154

    xor-int/2addr v2, v3

    const v3, 0x1339aeb2

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u1a79\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x65fb

    const v3, -0x7348f2eb

    xor-int/2addr v2, v3

    const v3, 0x7945a6bc

    goto/16 :goto_0

    .line 43
    :sswitch_d
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    const-string v1, "\u0733\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x42ad

    const v3, -0x5735531b

    xor-int/2addr v2, v3

    const v3, 0x218f4458

    goto/16 :goto_0

    .line 194
    :sswitch_e
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v1

    if-eqz v1, :cond_c

    :cond_b
    :goto_5
    const-string v1, "\u06d6\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x6d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0xaf9

    const v3, -0x20e70923

    xor-int/2addr v2, v3

    const v3, -0x2535738b

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06d6\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x1c65

    const v3, 0x111b3eb4

    xor-int/2addr v2, v3

    const v3, -0x6aca63ae

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x74b4ff7e -> :sswitch_a
        -0x6f5d3758 -> :sswitch_0
        -0x69fd0efc -> :sswitch_4
        -0x671fb8fd -> :sswitch_2
        -0x5a1d6f15 -> :sswitch_9
        -0x57f566b6 -> :sswitch_3
        -0x535788e9 -> :sswitch_b
        -0x4fbdd749 -> :sswitch_4
        -0x49fc8ef8 -> :sswitch_8
        -0x3ca9337c -> :sswitch_d
        -0xc5559b0 -> :sswitch_9
        -0xb9eb776 -> :sswitch_c
        -0x6a09597 -> :sswitch_b
        -0x6403687 -> :sswitch_2
        0xbe59079 -> :sswitch_5
        0xdc6b07d -> :sswitch_e
        0xf201d85 -> :sswitch_6
        0xf2bceab -> :sswitch_e
        0xfef65af -> :sswitch_3
        0x1275985c -> :sswitch_1
        0x33bc0b92 -> :sswitch_7
        0x3fccaef1 -> :sswitch_c
        0x4af06c30 -> :sswitch_d
        0x51b60bd0 -> :sswitch_0
        0x60d18ddc -> :sswitch_7
        0x654077dc -> :sswitch_6
        0x6792d852 -> :sswitch_5
        0x75db9286 -> :sswitch_1
        0x7644d132 -> :sswitch_a
        0x7d173cfd -> :sswitch_8
    .end sparse-switch
.end method

.method public final showToast(Ljava/lang/CharSequence;)V
    .locals 6

    const v0, 0x259dcb86

    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    sget v2, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v3, "\u06eb\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5fdf

    const v5, 0x427c1ef5

    xor-int/2addr v4, v5

    const v5, -0x25637b75

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x11a9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_4

    :sswitch_0
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_a

    goto/16 :goto_4

    .line 16
    :sswitch_1
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06d6\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6211

    const v5, 0x6b564628

    xor-int/2addr v4, v5

    const v5, -0x735546f2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_7

    goto/16 :goto_4

    .line 25
    :sswitch_3
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    goto/16 :goto_4

    .line 160
    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    return-void

    .line 86
    :sswitch_5
    new-instance v3, Ll/ۤ᩹ۘ;

    .line 57
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 86
    invoke-direct {v3, v0, p1}, Ll/ۤ᩹ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 207
    :sswitch_6
    sget-object v3, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    .line 147
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u05a1\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x69f7

    const v5, -0x6c4709ed

    xor-int/2addr v4, v5

    const v5, 0x4ff071e5

    goto :goto_0

    .line 66
    :sswitch_7
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_3

    :goto_1
    const-string v3, "\u06d6\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7847

    const v5, -0x702c3a29

    xor-int/2addr v4, v5

    const v5, -0x4e28b3aa

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a74\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xb91

    const v5, -0x7db9852

    xor-int/2addr v4, v5

    const v5, -0x4181b777

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06d7\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2c9d

    const v5, -0x253c9e38

    xor-int/2addr v4, v5

    const v5, 0x19456ddc

    goto/16 :goto_0

    .line 145
    :sswitch_9
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06e4\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x190f

    const v5, 0x25016457

    xor-int/2addr v4, v5

    const v5, 0x1a328abf

    goto/16 :goto_0

    .line 6
    :sswitch_a
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u073f\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2cf9

    const v5, 0x1146e963

    xor-int/2addr v4, v5

    const v5, 0x7cbfc716

    goto/16 :goto_0

    .line 68
    :sswitch_b
    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06e2\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x39db

    const v5, -0x8ef5fe

    xor-int/2addr v4, v5

    const v5, -0x57362845

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a74\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1475

    const v5, -0x35390870    # -6519752.0f

    xor-int/2addr v4, v5

    const v5, 0x3b91c0c3

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a79\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6597

    const v5, -0x1b0b3c60

    xor-int/2addr v4, v5

    const v5, 0x5a1b1437

    goto/16 :goto_0

    .line 132
    :sswitch_c
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u05a8\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x54b5

    const v5, 0x3dd8798e

    xor-int/2addr v4, v5

    const v5, -0x2d1356c3

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06ec\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1a61

    const v5, -0x5ceb157c

    xor-int/2addr v4, v5

    const v5, 0x4bab0b18    # 2.2418992E7f

    goto/16 :goto_0

    .line 36
    :sswitch_d
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u06dc\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3cef

    const v5, -0x5cfa3ff0

    xor-int/2addr v4, v5

    const v5, -0x1dec4d82

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5989

    const v5, 0x118a60d3

    xor-int/2addr v4, v5

    const v5, 0x6e929bd6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d069b73 -> :sswitch_d
        -0x7c975aad -> :sswitch_8
        -0x708b3df5 -> :sswitch_7
        -0x6564f617 -> :sswitch_b
        -0x603d3cca -> :sswitch_9
        -0x535f6a19 -> :sswitch_0
        -0x44d013aa -> :sswitch_1
        -0x3cf2cabf -> :sswitch_4
        -0x3a4e7bcd -> :sswitch_7
        -0x2ba8e7ef -> :sswitch_2
        -0x2056e0ce -> :sswitch_0
        -0x15674f0e -> :sswitch_b
        -0x142f71a6 -> :sswitch_3
        -0x12af95f9 -> :sswitch_d
        -0xe2c4176 -> :sswitch_6
        -0xa3732f3 -> :sswitch_4
        -0x32aba89 -> :sswitch_6
        0x1aec1192 -> :sswitch_a
        0x2c86e3a4 -> :sswitch_1
        0x32de247b -> :sswitch_5
        0x3bb9d957 -> :sswitch_5
        0x406415c9 -> :sswitch_9
        0x42576b6a -> :sswitch_8
        0x5269aab2 -> :sswitch_2
        0x5e114808 -> :sswitch_3
        0x5f567f9e -> :sswitch_c
        0x668b5350 -> :sswitch_a
        0x7d43b170 -> :sswitch_c
    .end sparse-switch
.end method

.method public final varargs showToast(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x180e2613

    sget v2, Ll/֫;->ܶܺ᩻:I

    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    const-string v4, "\u06ec\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7fed

    const v6, -0x7b41c21

    xor-int/2addr v5, v6

    const v6, -0xabbde61

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x4d1f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 212
    invoke-static {p1}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Ll/֡֨ۘ;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 4
    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_1

    goto :goto_1

    .line 74
    :sswitch_0
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_9

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_2

    .line 95
    :sswitch_2
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v4

    if-gez v4, :cond_2

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    goto/16 :goto_3

    .line 142
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    return-void

    .line 213
    :sswitch_5
    sget-object v4, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    .line 86
    new-instance v4, Ll/ۤ᩹ۘ;

    const/4 v5, 0x0

    .line 204
    sget-boolean v6, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v6, :cond_0

    goto :goto_1

    .line 86
    :cond_0
    invoke-direct {v4, v5, v0}, Ll/ۤ᩹ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v4}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :goto_1
    const-string v4, "\u0733\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5cd9

    const v6, 0x3579fee0

    xor-int/2addr v5, v6

    const v6, 0x7431e21d

    goto :goto_0

    :cond_1
    const-string v4, "\u06da\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1721

    const v6, -0x53a0ef1b

    xor-int/2addr v5, v6

    const v6, 0x1eb422e

    goto :goto_0

    .line 204
    :sswitch_6
    sget v4, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v4, :cond_3

    :cond_2
    :goto_2
    const-string v4, "\u05a8\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4c47

    const v6, 0x502adeaf

    xor-int/2addr v5, v6

    const v6, -0x761eb733

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a78\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6f99

    const v6, -0x45029368

    xor-int/2addr v5, v6

    const v6, -0x2e665db7

    goto/16 :goto_0

    .line 60
    :sswitch_7
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_4

    :goto_3
    const-string v4, "\u0730\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5479

    const v6, 0xcfd3fe1

    xor-int/2addr v5, v6

    const v6, 0x5fcbb8e7

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e8\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1771

    const v6, 0x47611fa9

    xor-int/2addr v5, v6

    const v6, 0x661e4bd1

    goto/16 :goto_0

    .line 47
    :sswitch_8
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u1a73\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1a3d

    const v6, 0x39f4d767

    xor-int/2addr v5, v6

    const v6, -0x593ace94

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06e2\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5303

    const v6, -0x52f7866e

    xor-int/2addr v5, v6

    const v6, -0x1aaf1353

    goto/16 :goto_0

    .line 211
    :sswitch_a
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u06da\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1629

    const v6, 0x6239ca2a

    xor-int/2addr v5, v6

    const v6, 0x20657eb2

    goto/16 :goto_0

    .line 130
    :sswitch_b
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u05ab\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7aa9

    const v6, -0x42996810

    xor-int/2addr v5, v6

    const v6, 0x46884dea

    goto/16 :goto_0

    .line 44
    :sswitch_c
    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_a

    :cond_9
    const-string v4, "\u0730\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5657

    const v6, 0x41a5abc7

    xor-int/2addr v5, v6

    const v6, 0x481f918d

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06dc\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7309

    const v6, 0x5b436a00

    xor-int/2addr v5, v6

    const v6, -0x61238c71    # -2.33412E-20f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v4

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e1\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x51ed

    const v6, 0x76d342d9

    xor-int/2addr v5, v6

    const v6, -0x1c7fc6f8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06df\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x957

    const v6, 0x720d09fd

    xor-int/2addr v5, v6

    const v6, 0x3c08b6ba

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6d7e89c6 -> :sswitch_a
        -0x58de252b -> :sswitch_7
        -0x524142d6 -> :sswitch_b
        -0x4b4056c4 -> :sswitch_1
        -0x46661cbe -> :sswitch_0
        -0x442224ae -> :sswitch_4
        -0x3fcb6a3c -> :sswitch_8
        -0x2f8e8a08 -> :sswitch_2
        -0x14354165 -> :sswitch_1
        -0x12a204e2 -> :sswitch_6
        -0xe61efac -> :sswitch_0
        0x17b0ffb -> :sswitch_c
        0x1d83ec9 -> :sswitch_5
        0x3fa60f7 -> :sswitch_c
        0x513a95c -> :sswitch_7
        0x7965308 -> :sswitch_2
        0x25aa2b2a -> :sswitch_d
        0x2a3428a2 -> :sswitch_3
        0x365c4993 -> :sswitch_a
        0x431fade7 -> :sswitch_d
        0x43864daa -> :sswitch_8
        0x4cbe9dc9 -> :sswitch_9
        0x4f50a48b -> :sswitch_9
        0x55eeabec -> :sswitch_6
        0x6bef6af9 -> :sswitch_4
        0x758fdd22 -> :sswitch_3
        0x7aca1923 -> :sswitch_b
        0x7fcc445d -> :sswitch_5
    .end sparse-switch
.end method

.method public final showToastL(Ljava/lang/CharSequence;)V
    .locals 6

    const v0, -0x310a208

    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v3, "\u0730\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6117

    const v5, -0x16e55adf

    xor-int/2addr v4, v5

    const v5, 0x32cface0

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3845

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 150
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_2

    .line 141
    :sswitch_0
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v3, :cond_7

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-eqz v3, :cond_9

    goto :goto_1

    .line 108
    :sswitch_2
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-gez v3, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v3, "\u1a77\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3b3f

    const v5, -0x33f65a2b    # -3.608354E7f

    xor-int/2addr v4, v5

    const v5, -0x40018554

    goto :goto_0

    .line 140
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    goto/16 :goto_4

    .line 70
    :sswitch_4
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    return-void

    .line 90
    :sswitch_5
    new-instance v3, Ll/۟᩹ۘ;

    .line 188
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_1

    goto/16 :goto_5

    :cond_1
    const/4 v0, 0x0

    .line 90
    invoke-direct {v3, v0, p1}, Ll/۟᩹ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 218
    :sswitch_6
    sget-object v3, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    .line 45
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a76\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x639b

    const v5, -0x57dbb144

    xor-int/2addr v4, v5

    const v5, 0x2e9e703

    goto :goto_0

    :cond_3
    const-string v3, "\u1a77\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x363f

    const v5, -0x48a6a8a

    xor-int/2addr v4, v5

    const v5, 0x62727fef

    goto/16 :goto_0

    .line 88
    :sswitch_7
    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u0736\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7d25

    const v5, 0x393d7adc

    xor-int/2addr v4, v5

    const v5, -0x657455af

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-ltz v3, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v3, "\u06d7\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5ff1

    const v5, 0x2bd800b1

    xor-int/2addr v4, v5

    const v5, 0xa7e2361

    goto/16 :goto_0

    .line 172
    :sswitch_9
    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u1a78\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xb91

    const v5, 0x4a86b886    # 4414531.0f

    xor-int/2addr v4, v5

    const v5, -0x50185d35

    goto/16 :goto_0

    .line 159
    :sswitch_a
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06e4\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1f57

    const v5, 0x451b5d57

    xor-int/2addr v4, v5

    const v5, -0x61bd63d0

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e7\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3085

    const v5, 0x58c5b909

    xor-int/2addr v4, v5

    const v5, -0x5e2b4cfd

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u073f\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x21ab

    const v5, 0x164dd62a

    xor-int/2addr v4, v5

    const v5, 0x415c6871

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a74\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4901

    const v5, -0x1fbebfac

    xor-int/2addr v4, v5

    const v5, -0x7e994210

    goto/16 :goto_0

    .line 171
    :sswitch_c
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v3

    if-nez v3, :cond_b

    :goto_4
    const-string v3, "\u06e1\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7f4b

    const v5, -0x715e143c

    xor-int/2addr v4, v5

    const v5, 0x92f6762

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e2\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x561d

    const v5, -0x3d85db

    xor-int/2addr v4, v5

    const v5, 0x10890f1c

    goto/16 :goto_0

    .line 121
    :sswitch_d
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_c

    :goto_5
    const-string v3, "\u06db\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5fbd

    const v5, -0x20bcc915

    xor-int/2addr v4, v5

    const v5, 0x4573ce09

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06ec\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6f4d

    const v5, -0x56ac1c3d

    xor-int/2addr v4, v5

    const v5, -0x32052bae

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dc0d83d -> :sswitch_1
        -0x7a8919c2 -> :sswitch_5
        -0x79d42c1c -> :sswitch_3
        -0x788faf07 -> :sswitch_a
        -0x7346c7d5 -> :sswitch_0
        -0x6df5dc4e -> :sswitch_a
        -0x674bec03 -> :sswitch_0
        -0x62dff95f -> :sswitch_2
        -0x5b95b253 -> :sswitch_b
        -0x549851a3 -> :sswitch_9
        -0x3ab02832 -> :sswitch_4
        -0x3997f5ab -> :sswitch_d
        -0x37c55b43 -> :sswitch_3
        -0x2dd5523e -> :sswitch_6
        -0x28dc263a -> :sswitch_d
        -0x17743b83 -> :sswitch_7
        -0xbc1405c -> :sswitch_2
        -0x87e5abf -> :sswitch_8
        -0x1ebc58a -> :sswitch_c
        0xac56d19 -> :sswitch_7
        0x11850cf5 -> :sswitch_5
        0x25e1a656 -> :sswitch_9
        0x3ecb0440 -> :sswitch_1
        0x48ecee80 -> :sswitch_b
        0x4e451582 -> :sswitch_4
        0x51d450e9 -> :sswitch_8
        0x5f72b4a0 -> :sswitch_6
        0x6f0f1ffa -> :sswitch_c
    .end sparse-switch
.end method

.method public final varargs showToastL(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x211a2faa

    sget v2, Ll/֫֡;->ۡ᩹ۗ:I

    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    const-string v4, "\u06dc\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x598b

    const v6, 0xaebef53

    xor-int/2addr v5, v6

    const v6, -0x5a433b38

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x68e9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 112
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_5

    goto/16 :goto_3

    .line 93
    :sswitch_0
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06ec\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6ab3

    const v6, 0x4f520c5a

    xor-int/2addr v5, v6

    const v6, 0x6ff3e518

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-gtz v4, :cond_9

    goto/16 :goto_2

    .line 135
    :sswitch_2
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v4, :cond_7

    goto :goto_1

    .line 25
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto :goto_1

    .line 176
    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    return-void

    .line 224
    :sswitch_5
    sget-object v4, Ll/᩷᩹ۘ;->᩹:Ll/֡֨ۘ;

    .line 90
    new-instance v4, Ll/۟᩹ۘ;

    const/4 v5, 0x0

    .line 58
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v6

    if-eqz v6, :cond_1

    goto/16 :goto_3

    .line 90
    :cond_1
    invoke-direct {v4, v5, v0}, Ll/۟᩹ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v4}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 223
    :sswitch_6
    invoke-static {p1}, Ll/֫᩺;->֨۠ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Ll/֡֨ۘ;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 85
    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a7a\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1c05

    const v6, -0x55306cdc

    xor-int/2addr v5, v6

    const v6, 0x61244566

    goto :goto_0

    .line 74
    :sswitch_7
    sget-boolean v4, Ll/᩶;->ۚۤۘ:Z

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u05a8\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5fa1

    const v6, 0xc1ea3d5

    xor-int/2addr v5, v6

    const v6, 0x7f53880e

    goto/16 :goto_0

    .line 217
    :sswitch_8
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v4

    if-ltz v4, :cond_4

    :goto_1
    const-string v4, "\u1a79\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7625

    const v6, 0x6b6095ec

    xor-int/2addr v5, v6

    const v6, -0x6ae44c31

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06d9\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6031

    const v6, -0x6546a1f7

    xor-int/2addr v5, v6

    const v6, 0x773df81d

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d6\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x394d

    const v6, 0x4a5886ca    # 3547570.5f

    xor-int/2addr v5, v6

    const v6, 0xad32565

    goto/16 :goto_0

    .line 221
    :sswitch_9
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v4, "\u0733\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x233b

    const v6, 0x173f9d56

    xor-int/2addr v5, v6

    const v6, -0x3e2bfef8

    goto/16 :goto_0

    .line 222
    :sswitch_a
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u1a73\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2a99

    const v6, 0x4921c772    # 662647.1f

    xor-int/2addr v5, v6

    const v6, -0x53d02913

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a73\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7b35

    const v6, 0x5a31db08

    xor-int/2addr v5, v6

    const v6, 0x1b3f1ecd

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-gtz v4, :cond_a

    :cond_9
    const-string v4, "\u06e8\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5e83

    const v6, -0x19d2c166

    xor-int/2addr v5, v6

    const v6, -0x413cc2fe

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06da\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xdb7

    const v6, 0x3e9aa488

    xor-int/2addr v5, v6

    const v6, 0x3d265865

    goto/16 :goto_0

    .line 48
    :sswitch_c
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_b

    goto :goto_3

    :cond_b
    const-string v4, "\u06dc\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7919

    const v6, -0x2d12174

    xor-int/2addr v5, v6

    const v6, 0x567f58d8

    goto/16 :goto_0

    .line 186
    :sswitch_d
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v4

    if-eqz v4, :cond_c

    :goto_3
    const-string v4, "\u06eb\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xac7

    const v6, 0x56243d4b

    xor-int/2addr v5, v6

    const v6, -0x7880a95e

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d6\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4fdf

    const v6, -0x11d61d29

    xor-int/2addr v5, v6

    const v6, -0x6bf15cf6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a5659bb -> :sswitch_5
        -0x77dd47f2 -> :sswitch_a
        -0x77bbba21 -> :sswitch_d
        -0x77016160 -> :sswitch_c
        -0x7641025c -> :sswitch_3
        -0x6a8d7008 -> :sswitch_8
        -0x68549a7a -> :sswitch_6
        -0x55775d92 -> :sswitch_a
        -0x502fc650 -> :sswitch_c
        -0x49d1f661 -> :sswitch_7
        -0x3f21da39 -> :sswitch_7
        -0x28ef40a5 -> :sswitch_2
        -0x23c36fae -> :sswitch_4
        -0x20e549aa -> :sswitch_0
        -0x1959249f -> :sswitch_2
        -0xa35cfa4 -> :sswitch_0
        -0x7937ebf -> :sswitch_5
        -0x4e44298 -> :sswitch_8
        0x2b6a90f -> :sswitch_4
        0xe1abe98 -> :sswitch_b
        0x22c000d2 -> :sswitch_1
        0x2736039a -> :sswitch_6
        0x379614e8 -> :sswitch_d
        0x37a22676 -> :sswitch_9
        0x3b82cd62 -> :sswitch_3
        0x435919ba -> :sswitch_9
        0x68c2ba5f -> :sswitch_b
        0x7339381d -> :sswitch_1
    .end sparse-switch
.end method
