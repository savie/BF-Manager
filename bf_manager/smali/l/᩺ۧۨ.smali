.class public final Ll/᩺ۧۨ;
.super Ljava/lang/Object;
.source "SAJE"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ᩵ۤۨ:[S


# instance fields
.field public final synthetic ܺ:Ll/ۨۜ᩹;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩺ۧۨ;->᩵ۤۨ:[S

    return-void

    :array_0
    .array-data 2
        0x902s
        0x7952s
        0x794es
        0x794es
        0x794as
        0x7949s
        0x7900s
        0x7915s
        0x7915s
        0x795ds
        0x7953s
        0x794es
        0x7952s
        0x794fs
        0x7958s
        0x7914s
        0x7959s
        0x7955s
        0x7957s
        0x7915s
        0x7976s
        0x7917s
        0x7970s
        0x7973s
        0x7974s
        0x7978s
        0x7973s
        0x7974s
        0x7915s
        0x797bs
        0x794as
        0x7951s
        0x797es
        0x795bs
        0x794es
        0x795bs
        0x7977s
        0x794fs
        0x7956s
        0x794es
        0x7953s
        0x794as
        0x7956s
        0x795fs
        0x7942s
        0x7953s
        0x7954s
        0x795ds
    .end array-data
.end method

.method public constructor <init>(Ll/ۨۜ᩹;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۧۨ;->ܺ:Ll/ۨۜ᩹;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 18
    sget-boolean p1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll/᩺ۧۨ;->᩵ۤۨ:[S

    sget-boolean v0, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    const/4 v0, 0x0

    .line 26
    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v1, :cond_2

    goto :goto_2

    :cond_2
    aget-short p1, p1, v0

    .line 10
    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v0, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit16 v0, p1, 0x4198

    .line 37
    sget v1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v1, :cond_4

    .line 50
    :goto_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result p1

    if-nez p1, :cond_9

    goto :goto_2

    :cond_4
    mul-int v0, v0, v0

    mul-int p1, p1, p1

    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v1, :cond_5

    goto :goto_2

    :cond_5
    const v1, 0x10ce8a40

    .line 56
    sget v2, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v2, :cond_6

    goto :goto_3

    :cond_6
    add-int/2addr p1, v1

    add-int/2addr p1, p1

    sub-int/2addr p1, v0

    if-ltz p1, :cond_7

    const/16 p1, 0x793a

    goto :goto_1

    :cond_7
    const/16 p1, 0x1d59

    .line 57
    :goto_1
    iget-object v0, p0, Ll/᩺ۧۨ;->ܺ:Ll/ۨۜ᩹;

    invoke-static {v0}, Ll/ۖۧ;->ۗ᩵ܺ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v0

    .line 48
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_4

    .line 57
    :cond_8
    sget-object v1, Ll/᩺ۧۨ;->᩵ۤۨ:[S

    sget v2, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v2, :cond_b

    .line 25
    :cond_9
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    sget p1, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez p1, :cond_a

    goto :goto_3

    .line 15
    :cond_a
    :goto_2
    sget p1, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez p1, :cond_c

    goto :goto_4

    :cond_b
    const/4 v2, 0x1

    .line 0
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_d

    .line 46
    :cond_c
    :goto_3
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    .line 25
    :goto_4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    return-void

    :cond_d
    const/16 v3, 0x2f

    .line 57
    invoke-static {v1, v2, v3, p1}, Ll/֫ۚ;->᩸ܺ᩷([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۖᩴ;->ۖۖܳ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
