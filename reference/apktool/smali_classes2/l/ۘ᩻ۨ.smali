.class public final Ll/ۘ᩻ۨ;
.super Ljava/lang/Object;
.source "Q9SO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ۤܶۤ:[S


# instance fields
.field public final synthetic ܺ:Ll/ۨۜ᩹;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۘ᩻ۨ;->ۤܶۤ:[S

    return-void

    :array_0
    .array-data 2
        0x17ffs
        -0x681as
        -0x6806s
        -0x6806s
        -0x6802s
        -0x6803s
        -0x684cs
        -0x685fs
        -0x685fs
        -0x6817s
        -0x6819s
        -0x6806s
        -0x681as
        -0x6805s
        -0x6814s
        -0x6860s
        -0x6813s
        -0x681fs
        -0x681ds
        -0x685fs
        -0x683es
        -0x685ds
        -0x683cs
        -0x6839s
        -0x6840s
        -0x6834s
        -0x6839s
        -0x6840s
        -0x685fs
        -0x683ds
        -0x6826s
        -0x6836s
        -0x6811s
        -0x6806s
        -0x6811s
        -0x6838s
        -0x6819s
        -0x681es
        -0x6815s
        -0x6803s
        -0x6822s
        -0x6804s
        -0x681fs
        -0x6808s
        -0x6819s
        -0x6816s
        -0x6815s
        -0x6804s
    .end array-data
.end method

.method public constructor <init>(Ll/ۨۜ᩹;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩻ۨ;->ܺ:Ll/ۨۜ᩹;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 38
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_2

    :cond_0
    sget-object p1, Ll/ۘ᩻ۨ;->ۤܶۤ:[S

    .line 17
    sget-boolean v0, Ll/᩶;->ۚۤۘ:Z

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    .line 33
    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v1, :cond_2

    goto :goto_4

    :cond_2
    aget-short p1, p1, v0

    .line 0
    sget v0, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v0, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v0, p1, 0x1

    .line 34
    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v1, :cond_4

    goto :goto_1

    :cond_4
    mul-int v0, v0, v0

    .line 32
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_5

    goto :goto_5

    :cond_5
    mul-int/lit8 p1, p1, 0x2

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v1

    if-gtz v1, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 p1, p1, 0x1

    sub-int/2addr v0, p1

    if-ltz v0, :cond_7

    const p1, 0x978e

    goto :goto_0

    :cond_7
    const p1, 0xa052

    .line 51
    :goto_0
    iget-object v0, p0, Ll/ۘ᩻ۨ;->ܺ:Ll/ۨۜ᩹;

    invoke-static {v0}, Ll/ۖۧ;->ۗ᩵ܺ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v0

    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v1, :cond_8

    goto :goto_5

    :cond_8
    sget-object v1, Ll/ۘ᩻ۨ;->ۤܶۤ:[S

    .line 45
    sget v2, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v2, :cond_c

    .line 38
    :goto_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget p1, Ll/ۗ;->֨۬ۖ:I

    if-gez p1, :cond_9

    goto :goto_4

    :cond_9
    :goto_2
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget p1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez p1, :cond_a

    goto :goto_5

    .line 23
    :cond_a
    :goto_3
    sget-boolean p1, Ll/᩶;->ۚۤۘ:Z

    if-eqz p1, :cond_b

    goto :goto_5

    .line 4
    :cond_b
    :goto_4
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto :goto_5

    :cond_c
    const/4 v2, 0x1

    .line 9
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_d

    .line 48
    :goto_5
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    return-void

    :cond_d
    const/16 v3, 0x2f

    .line 51
    invoke-static {v1, v2, v3, p1}, Ll/֡ۛ;->ܰۙۚ([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۖᩴ;->ۖۖܳ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
