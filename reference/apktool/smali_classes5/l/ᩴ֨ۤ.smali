.class public final Ll/ᩴ֨ۤ;
.super Ljava/lang/Object;
.source "SAJE"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ۟ۘ۬:[S


# instance fields
.field public final synthetic ܰ:Ll/۠ۨܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ֨ۤ;->۟ۘ۬:[S

    return-void

    :array_0
    .array-data 2
        0xf1bs
        -0x3599s
        -0x3585s
        -0x3585s
        -0x3581s
        -0x3584s
        -0x35cbs
        -0x35e0s
        -0x35e0s
        -0x3598s
        -0x359as
        -0x3585s
        -0x3599s
        -0x3586s
        -0x3593s
        -0x35dfs
        -0x3594s
        -0x35a0s
        -0x359es
        -0x35e0s
        -0x35bds
        -0x35des
        -0x35bbs
        -0x35bas
        -0x35bfs
        -0x35b3s
        -0x35bas
        -0x35bfs
        -0x35e0s
        -0x35b2s
        -0x3581s
        -0x359cs
        -0x35b5s
        -0x3592s
        -0x3585s
        -0x3592s
        -0x35bes
        -0x3586s
        -0x359ds
        -0x3585s
        -0x359as
        -0x3581s
        -0x359ds
        -0x3596s
        -0x3589s
        -0x359as
        -0x359fs
        -0x3598s
    .end array-data
.end method

.method public constructor <init>(Ll/۠ۨܳ;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ֨ۤ;->ܰ:Ll/۠ۨܳ;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    sget-boolean p1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    sget p1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Ll/ᩴ֨ۤ;->۟ۘ۬:[S

    .line 46
    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v1, :cond_3

    goto :goto_1

    :cond_3
    aget-short p1, p1, v0

    .line 44
    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit16 v0, p1, 0x3fe

    mul-int v0, v0, v0

    .line 55
    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_5

    .line 15
    :goto_0
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result p1

    if-lez p1, :cond_6

    goto :goto_4

    :cond_5
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_8

    .line 7
    :cond_6
    sget p1, Ll/ۖۗ;->᩻ܳܶ:I

    if-lez p1, :cond_7

    goto :goto_4

    .line 17
    :cond_7
    :goto_1
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget p1, Ll/ۗܰ;->ܶۜ۬:I

    if-gez p1, :cond_b

    goto :goto_4

    :cond_8
    mul-int/lit16 p1, p1, 0xff8

    sub-int/2addr v0, p1

    if-ltz v0, :cond_9

    const p1, 0xca0f

    goto :goto_2

    :cond_9
    const/16 p1, 0x132b

    .line 57
    :goto_2
    iget-object v0, p0, Ll/ᩴ֨ۤ;->ܰ:Ll/۠ۨܳ;

    invoke-static {v0}, Ll/֡᩵;->ۨۗ᩺(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v0

    .line 16
    sget-boolean v1, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v1, :cond_a

    goto :goto_3

    .line 57
    :cond_a
    sget-object v1, Ll/ᩴ֨ۤ;->۟ۘ۬:[S

    .line 15
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    :goto_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    goto :goto_4

    :cond_c
    const/4 v2, 0x1

    .line 3
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_d

    .line 35
    :goto_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    return-void

    :cond_d
    const/16 v3, 0x2f

    .line 57
    invoke-static {v1, v2, v3, p1}, Ll/ۗ֡;->ۘ᩺ۘ([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/֫֡;->۫۟᩻(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
