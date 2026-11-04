.class public final Ll/ۤۛۚ;
.super Ljava/lang/Object;
.source "079R"


# instance fields
.field public final ֫:Ll/ۨ᩹ۚ;

.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Ll/᩷ۛۚ;

.field public final ۚ:I

.field public final ۤ:Ljava/lang/String;

.field public final ۧ:Ll/ܰ᩹ۚ;

.field public final ۫:Z

.field public final ܳ:Z

.field public final ܶ:Ljava/lang/String;

.field public final ܺ:Ljava/lang/String;

.field public final ܽ:Ljava/util/ArrayList;

.field public final ᩴ:Z

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:I

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;IZIZZLjava/lang/String;Ljava/lang/String;Ll/᩷ۛۚ;Ljava/lang/String;Ll/ۨ᩹ۚ;Ll/ܰ᩹ۚ;)V
    .locals 2

    move-object v0, p0

    .line 272
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 273
    iput-object v1, v0, Ll/ۤۛۚ;->ۗ:Ljava/lang/String;

    move-object v1, p2

    .line 274
    iput-object v1, v0, Ll/ۤۛۚ;->ۤ:Ljava/lang/String;

    if-nez p3, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, p3

    .line 276
    :goto_0
    iput-object v1, v0, Ll/ۤۛۚ;->ܶ:Ljava/lang/String;

    move-object v1, p4

    .line 277
    iput-object v1, v0, Ll/ۤۛۚ;->᩻:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 278
    iput-object v1, v0, Ll/ۤۛۚ;->֫:Ll/ۨ᩹ۚ;

    move-object v1, p5

    .line 279
    iput-object v1, v0, Ll/ۤۛۚ;->ܽ:Ljava/util/ArrayList;

    move v1, p6

    .line 280
    iput v1, v0, Ll/ۤۛۚ;->ۚ:I

    move v1, p7

    .line 281
    iput-boolean v1, v0, Ll/ۤۛۚ;->۫:Z

    move v1, p8

    .line 282
    iput v1, v0, Ll/ۤۛۚ;->᩹:I

    move v1, p9

    .line 283
    iput-boolean v1, v0, Ll/ۤۛۚ;->ᩴ:Z

    move v1, p10

    .line 284
    iput-boolean v1, v0, Ll/ۤۛۚ;->ܳ:Z

    move-object v1, p11

    .line 285
    iput-object v1, v0, Ll/ۤۛۚ;->᩸:Ljava/lang/String;

    move-object v1, p12

    .line 286
    iput-object v1, v0, Ll/ۤۛۚ;->ܺ:Ljava/lang/String;

    move-object v1, p13

    .line 287
    iput-object v1, v0, Ll/ۤۛۚ;->ۙ:Ll/᩷ۛۚ;

    move-object/from16 v1, p14

    .line 288
    iput-object v1, v0, Ll/ۤۛۚ;->᩷:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 289
    iput-object v1, v0, Ll/ۤۛۚ;->ۧ:Ll/ܰ᩹ۚ;

    return-void
.end method
