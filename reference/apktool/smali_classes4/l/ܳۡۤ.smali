.class public final Ll/ܳۡۤ;
.super Ljava/lang/Object;
.source "Q9SO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ۛܽۖ:[S


# instance fields
.field public final synthetic ܰ:Ll/۠ۨܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܳۡۤ;->ۛܽۖ:[S

    return-void

    :array_0
    .array-data 2
        0x14cas
        -0x18c9s
        -0x18d5s
        -0x18d5s
        -0x18d1s
        -0x18d4s
        -0x189bs
        -0x1890s
        -0x1890s
        -0x18c8s
        -0x18cas
        -0x18d5s
        -0x18c9s
        -0x18d6s
        -0x18c3s
        -0x188fs
        -0x18c4s
        -0x18d0s
        -0x18ces
        -0x1890s
        -0x18eds
        -0x188es
        -0x18ebs
        -0x18eas
        -0x18efs
        -0x18e3s
        -0x18eas
        -0x18efs
        -0x1890s
        -0x18ees
        -0x18f5s
        -0x18e5s
        -0x18c2s
        -0x18d5s
        -0x18c2s
        -0x18e7s
        -0x18cas
        -0x18cds
        -0x18c6s
        -0x18d4s
        -0x18f1s
        -0x18d3s
        -0x18d0s
        -0x18d7s
        -0x18cas
        -0x18c5s
        -0x18c6s
        -0x18d3s
    .end array-data
.end method

.method public constructor <init>(Ll/۠ۨܳ;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۡۤ;->ܰ:Ll/۠ۨܳ;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    sget p1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz p1, :cond_0

    goto :goto_1

    :cond_0
    sget p1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz p1, :cond_1

    goto/16 :goto_4

    :cond_1
    sget-object p1, Ll/ܳۡۤ;->ۛܽۖ:[S

    .line 30
    sget v0, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    sget v1, Ll/֫֡;->֫ۙۖ:I

    if-gtz v1, :cond_3

    goto :goto_0

    :cond_3
    aget-short p1, p1, v0

    .line 1
    sget v0, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v0, :cond_4

    :goto_0
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget p1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz p1, :cond_6

    goto :goto_2

    :cond_4
    add-int/lit16 v0, p1, 0x403b

    mul-int v0, v0, v0

    .line 7
    sget v1, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v1, :cond_5

    goto :goto_2

    :cond_5
    const v1, 0x100ec

    sget v2, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v2, :cond_8

    .line 26
    :cond_6
    :goto_1
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget p1, Ll/֡᩻;->᩷ۧ᩺:I

    if-lez p1, :cond_7

    goto :goto_5

    .line 19
    :cond_7
    :goto_2
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_5

    :cond_8
    mul-int p1, p1, v1

    sub-int/2addr p1, v0

    if-gtz p1, :cond_9

    const p1, 0xe75f    # 8.3E-41f

    goto :goto_3

    :cond_9
    const/16 p1, 0x4c61

    .line 51
    :goto_3
    iget-object v0, p0, Ll/ܳۡۤ;->ܰ:Ll/۠ۨܳ;

    invoke-static {v0}, Ll/ۗ֨;->᩷۟ۚ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v0

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_4

    :cond_a
    sget-object v1, Ll/ܳۡۤ;->ۛܽۖ:[S

    .line 38
    sget v2, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v2, :cond_b

    goto :goto_4

    :cond_b
    const/4 v2, 0x1

    .line 50
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v3

    if-eqz v3, :cond_d

    .line 22
    :cond_c
    :goto_4
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    .line 18
    :goto_5
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    return-void

    :cond_d
    const/16 v3, 0x2f

    .line 51
    invoke-static {v1, v2, v3, p1}, Ll/۬;->ۜᩴ֡([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/֫֡;->۫۟᩻(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
