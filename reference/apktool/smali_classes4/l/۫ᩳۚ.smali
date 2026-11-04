.class public final Ll/۫ᩳۚ;
.super Ljava/lang/Object;
.source "Y6IM"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public ۗ:J

.field public ۙ:Ll/ܳᩳۚ;

.field public final ۚ:J

.field public ۤ:J

.field public final ۧ:Z

.field public ۨ:Lbin/mt/json/JSONArray;

.field public final ۫:Ljava/lang/String;

.field public ܳ:Lbin/mt/json/JSONObject;

.field public ܶ:J

.field public final ܺ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public final ᩴ:J

.field public final ᩵:Z

.field public final ᩷:J

.field public final ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJLjava/lang/String;Ljava/lang/String;JJ)V
    .locals 2

    .line 431
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 424
    iput-wide v0, p0, Ll/۫ᩳۚ;->ۗ:J

    const-string v0, "ready"

    .line 425
    iput-object v0, p0, Ll/۫ᩳۚ;->᩹:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Ll/۫ᩳۚ;->ܽ:Ljava/lang/String;

    .line 427
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Ll/۫ᩳۚ;->ۨ:Lbin/mt/json/JSONArray;

    .line 432
    iput-object p1, p0, Ll/۫ᩳۚ;->֫:Ljava/lang/String;

    .line 433
    iput-object p2, p0, Ll/۫ᩳۚ;->ܺ:Ljava/lang/String;

    .line 434
    iput-object p3, p0, Ll/۫ᩳۚ;->᩻:Ljava/lang/String;

    .line 435
    iput-boolean p4, p0, Ll/۫ᩳۚ;->᩵:Z

    .line 436
    iput-boolean p5, p0, Ll/۫ᩳۚ;->ۧ:Z

    .line 437
    iput-wide p6, p0, Ll/۫ᩳۚ;->ܶ:J

    .line 438
    iput-object p8, p0, Ll/۫ᩳۚ;->۫:Ljava/lang/String;

    .line 439
    iput-object p9, p0, Ll/۫ᩳۚ;->᩸:Ljava/lang/String;

    .line 440
    iput-wide p10, p0, Ll/۫ᩳۚ;->᩷:J

    const-wide/32 p1, 0x927c0

    add-long/2addr p12, p1

    .line 441
    iput-wide p12, p0, Ll/۫ᩳۚ;->ᩴ:J

    .line 442
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    add-long/2addr p3, p1

    iput-wide p3, p0, Ll/۫ᩳۚ;->ۚ:J

    return-void
.end method
