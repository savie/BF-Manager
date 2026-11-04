.class public final Ll/᩹ۢۤ;
.super Ljava/lang/Object;
.source "06A0"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ܿۛۚ:[S


# instance fields
.field public final synthetic ܰ:Ll/۠ۨܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x31

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩹ۢۤ;->ܿۛۚ:[S

    return-void

    :array_0
    .array-data 2
        0x237fs
        -0xa3fs
        -0xa23s
        -0xa23s
        -0xa27s
        -0xa26s
        -0xa6ds
        -0xa7as
        -0xa7as
        -0xa32s
        -0xa40s
        -0xa23s
        -0xa3fs
        -0xa24s
        -0xa35s
        -0xa79s
        -0xa36s
        -0xa3as
        -0xa3cs
        -0xa7as
        -0xa1bs
        -0xa7cs
        -0xa1ds
        -0xa20s
        -0xa19s
        -0xa15s
        -0xa20s
        -0xa19s
        -0xa7as
        -0xa18s
        -0xa27s
        -0xa3es
        -0xa06s
        -0xa40s
        -0xa32s
        -0xa39s
        -0xa38s
        -0xa23s
        -0xa24s
        -0xa25s
        -0xa34s
        -0xa1es
        -0xa40s
        -0xa3bs
        -0xa3bs
        -0xa34s
        -0xa25s
        -0xa14s
        -0xa2fs
    .end array-data
.end method

.method public constructor <init>(Ll/۠ۨܳ;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۢۤ;->ܰ:Ll/۠ۨܳ;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 13
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 47
    :cond_0
    sget-boolean p1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz p1, :cond_1

    goto/16 :goto_5

    :cond_1
    sget-object p1, Ll/᩹ۢۤ;->ܿۛۚ:[S

    .line 6
    sget v0, Ll/ۧ;->ۨۗܰ:I

    if-ltz v0, :cond_2

    goto :goto_4

    :cond_2
    const/4 v0, 0x0

    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v1, :cond_3

    goto :goto_4

    :cond_3
    aget-short p1, p1, v0

    .line 4
    sget v0, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v0, :cond_4

    .line 41
    :goto_0
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget p1, Ll/ۖ;->ܿۚ֡:I

    if-gez p1, :cond_a

    goto :goto_3

    :cond_4
    add-int/lit16 v0, p1, 0x35dd

    mul-int v0, v0, v0

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v1

    if-ltz v1, :cond_5

    goto :goto_3

    :cond_5
    const v1, 0xd774

    .line 13
    sget v2, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v2, :cond_6

    goto :goto_3

    :cond_6
    mul-int p1, p1, v1

    sub-int/2addr p1, v0

    if-lez p1, :cond_7

    const/16 p1, 0x4714

    goto :goto_1

    :cond_7
    const p1, 0xf5a9

    .line 89
    :goto_1
    iget-object v0, p0, Ll/᩹ۢۤ;->ܰ:Ll/۠ۨܳ;

    invoke-static {v0}, Ll/ۗ֨;->᩷۟ۚ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v0

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_4

    :cond_8
    sget-object v1, Ll/᩹ۢۤ;->ܿۛۚ:[S

    sget v2, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v2, :cond_9

    goto :goto_2

    :cond_9
    const/4 v2, 0x1

    .line 1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_d

    :cond_a
    :goto_2
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget p1, Ll/֫֨;->᩶ܺۡ:I

    if-lez p1, :cond_b

    goto :goto_4

    .line 81
    :cond_b
    :goto_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_5

    .line 20
    :cond_c
    :goto_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    .line 82
    :goto_5
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    return-void

    :cond_d
    const/16 v3, 0x30

    .line 89
    invoke-static {v1, v2, v3, p1}, Ll/ۖۖ;->ܺۙᩴ([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/֫֡;->۫۟᩻(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
