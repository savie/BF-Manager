.class public final Ll/ܺۛۨ;
.super Ljava/lang/Object;
.source "06A0"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ܽ᩹ۘ:[S


# instance fields
.field public final synthetic ܺ:Ll/ۨۜ᩹;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x31

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܺۛۨ;->ܽ᩹ۘ:[S

    return-void

    :array_0
    .array-data 2
        0x106s
        0x3fd3s
        0x3fcfs
        0x3fcfs
        0x3fcbs
        0x3fc8s
        0x3f81s
        0x3f94s
        0x3f94s
        0x3fdcs
        0x3fd2s
        0x3fcfs
        0x3fd3s
        0x3fces
        0x3fd9s
        0x3f95s
        0x3fd8s
        0x3fd4s
        0x3fd6s
        0x3f94s
        0x3ff7s
        0x3f96s
        0x3ff1s
        0x3ff2s
        0x3ff5s
        0x3ff9s
        0x3ff2s
        0x3ff5s
        0x3f94s
        0x3ffas
        0x3fcbs
        0x3fd0s
        0x3fe8s
        0x3fd2s
        0x3fdcs
        0x3fd5s
        0x3fdas
        0x3fcfs
        0x3fces
        0x3fc9s
        0x3fdes
        0x3ff0s
        0x3fd2s
        0x3fd7s
        0x3fd7s
        0x3fdes
        0x3fc9s
        0x3ffes
        0x3fc3s
    .end array-data
.end method

.method public constructor <init>(Ll/ۨۜ᩹;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۛۨ;->ܺ:Ll/ۨۜ᩹;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 31
    sget-boolean p1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz p1, :cond_0

    goto :goto_3

    .line 26
    :cond_0
    sget p1, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz p1, :cond_1

    goto :goto_3

    :cond_1
    sget-object p1, Ll/ܺۛۨ;->ܽ᩹ۘ:[S

    .line 67
    sget v0, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v1, :cond_3

    goto :goto_5

    :cond_3
    aget-short p1, p1, v0

    mul-int v0, p1, p1

    .line 17
    sget-boolean v1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const v1, 0x582a5e1

    add-int/2addr v0, v1

    .line 32
    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v1, :cond_5

    goto :goto_1

    .line 81
    :cond_5
    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v1, :cond_6

    goto :goto_5

    :cond_6
    mul-int/lit16 p1, p1, 0x4b1e

    sub-int/2addr v0, p1

    if-ltz v0, :cond_7

    const/16 p1, 0x3fbb

    goto :goto_0

    :cond_7
    const/16 p1, 0xff1

    .line 89
    :goto_0
    iget-object v0, p0, Ll/ܺۛۨ;->ܺ:Ll/ۨۜ᩹;

    invoke-static {v0}, Ll/ۖۧ;->ۗ᩵ܺ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v0

    .line 16
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_2

    .line 89
    :cond_8
    sget-object v1, Ll/ܺۛۨ;->ܽ᩹ۘ:[S

    .line 8
    sget-boolean v2, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v2, :cond_9

    goto :goto_4

    :cond_9
    const/4 v2, 0x1

    .line 59
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_d

    :goto_1
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_5

    .line 82
    :cond_a
    :goto_2
    sget p1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz p1, :cond_b

    goto :goto_5

    :cond_b
    :goto_3
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    sget p1, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz p1, :cond_c

    goto :goto_5

    .line 23
    :cond_c
    :goto_4
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    :goto_5
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    return-void

    :cond_d
    const/16 v3, 0x30

    .line 89
    invoke-static {v1, v2, v3, p1}, Ll/֨֫;->ܺᩴܳ([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۖᩴ;->ۖۖܳ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
