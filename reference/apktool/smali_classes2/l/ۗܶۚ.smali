.class public final Ll/ۗܶۚ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ֫:Z

.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Z

.field public final ۚ:Ll/ܽܶۚ;

.field public final ۛ:Ljava/lang/String;

.field public final ۤ:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ۨ:Z

.field public final ۫:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܶ:Ljava/lang/String;

.field public final ܺ:I

.field public final ܽ:Z

.field public final ᩴ:Z

.field public final ᩵:Ljava/lang/Integer;

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ljava/util/ArrayList;

.field public final ᩹:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܽܶۚ;Ljava/util/ArrayList;ZILl/ᩴ᩹ۚ;)V
    .locals 0

    .line 2406
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2407
    iput-object p1, p0, Ll/ۗܶۚ;->ܳ:Ljava/lang/String;

    .line 2408
    iput-object p2, p0, Ll/ۗܶۚ;->۫:Ljava/lang/String;

    .line 2409
    iput-object p3, p0, Ll/ۗܶۚ;->ۛ:Ljava/lang/String;

    .line 2410
    iput-object p4, p0, Ll/ۗܶۚ;->᩹:Ljava/lang/String;

    .line 2411
    iput-boolean p5, p0, Ll/ۗܶۚ;->֫:Z

    .line 2412
    iput-boolean p6, p0, Ll/ۗܶۚ;->ܽ:Z

    .line 2413
    iput-object p7, p0, Ll/ۗܶۚ;->ܶ:Ljava/lang/String;

    if-nez p15, :cond_0

    goto :goto_0

    .line 2415
    :cond_0
    iget-object p8, p15, Ll/ᩴ᩹ۚ;->᩸:Ljava/lang/String;

    :goto_0
    iput-object p8, p0, Ll/ۗܶۚ;->ۗ:Ljava/lang/String;

    .line 2416
    iput-object p9, p0, Ll/ۗܶۚ;->ۤ:Ljava/lang/String;

    .line 2417
    iput-object p10, p0, Ll/ۗܶۚ;->ۧ:Ljava/lang/String;

    .line 2418
    iput-object p11, p0, Ll/ۗܶۚ;->ۚ:Ll/ܽܶۚ;

    .line 2419
    iput-object p12, p0, Ll/ۗܶۚ;->᩸:Ljava/util/ArrayList;

    .line 2420
    iput-boolean p13, p0, Ll/ۗܶۚ;->ᩴ:Z

    .line 2421
    iput p14, p0, Ll/ۗܶۚ;->ܺ:I

    const/4 p1, 0x0

    if-nez p15, :cond_1

    move-object p2, p1

    goto :goto_1

    .line 2422
    :cond_1
    iget-object p2, p15, Ll/ᩴ᩹ۚ;->ۤ:Ljava/lang/String;

    :goto_1
    iput-object p2, p0, Ll/ۗܶۚ;->᩻:Ljava/lang/String;

    if-nez p15, :cond_2

    move-object p2, p1

    goto :goto_2

    .line 2423
    :cond_2
    iget-object p2, p15, Ll/ᩴ᩹ۚ;->ᩴ:Ljava/lang/Integer;

    :goto_2
    iput-object p2, p0, Ll/ۗܶۚ;->᩵:Ljava/lang/Integer;

    const/4 p2, 0x0

    if-eqz p15, :cond_3

    .line 2424
    iget-boolean p3, p15, Ll/ᩴ᩹ۚ;->ܳ:Z

    if-eqz p3, :cond_3

    const/4 p3, 0x1

    goto :goto_3

    :cond_3
    const/4 p3, 0x0

    :goto_3
    iput-boolean p3, p0, Ll/ۗܶۚ;->ۨ:Z

    if-eqz p15, :cond_4

    .line 2425
    iget-boolean p3, p15, Ll/ᩴ᩹ۚ;->ۙ:Z

    if-eqz p3, :cond_4

    const/4 p2, 0x1

    :cond_4
    iput-boolean p2, p0, Ll/ۗܶۚ;->ۙ:Z

    if-nez p15, :cond_5

    goto :goto_4

    .line 2426
    :cond_5
    iget-object p1, p15, Ll/ᩴ᩹ۚ;->᩷:Ljava/lang/String;

    :goto_4
    iput-object p1, p0, Ll/ۗܶۚ;->᩷:Ljava/lang/String;

    return-void
.end method
