.class public final Ll/᩹۠ܺ;
.super Ljava/lang/Object;
.source "SB7W"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ֡:Ll/ܽۖܺ;

.field public ֡ۙ:Ljava/lang/Float;

.field public ֨:Ljava/lang/Float;

.field public ֫ۙ:Ljava/lang/Float;

.field public ۖ:Ljava/util/ArrayList;

.field public ۗۙ:Ll/ۚ۠ܺ;

.field public ۘۙ:Ll/᩻۠ܺ;

.field public ۙۙ:Ll/ۧ۠ܺ;

.field public ۚۙ:Ll/֡۠ܺ;

.field public ۛۙ:Ljava/lang/Float;

.field public ۜ:Ll/۫۠ܺ;

.field public ۟:Ll/ܽ۠ܺ;

.field public ۟ۙ:Ljava/lang/Boolean;

.field public ۠:Ll/ܿۖܺ;

.field public ۡ:Ll/ܳ۠ܺ;

.field public ۢ:Ll/֡۠ܺ;

.field public ۤۙ:Ljava/lang/String;

.field public ۧۙ:J

.field public ۨۙ:Ljava/lang/Float;

.field public ۫ۙ:Ljava/lang/Boolean;

.field public ۬:Ljava/lang/Integer;

.field public ܰ:Ll/ۧۖܺ;

.field public ܰۙ:Ll/ܺ۠ܺ;

.field public ܳۙ:Ljava/lang/Float;

.field public ܶۙ:[Ll/ܿۖܺ;

.field public ܺۙ:Ljava/lang/Float;

.field public ܽۙ:Ll/֡۠ܺ;

.field public ܿ:Ll/ܳ۠ܺ;

.field public ܿۙ:Ll/֡۠ܺ;

.field public ᩳ:Ljava/lang/Boolean;

.field public ᩴۙ:Ljava/lang/String;

.field public ᩵ۙ:Ll/֫۠ܺ;

.field public ᩶:Ljava/lang/String;

.field public ᩶ۙ:Ll/ܶ۠ܺ;

.field public ᩷ۙ:Ljava/lang/String;

.field public ᩸ۙ:Ljava/lang/String;

.field public ᩹ۙ:Ll/ܿۖܺ;

.field public ᩺ۙ:Ll/ܿۖܺ;

.field public ᩻ۙ:Ll/֡۠ܺ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 1171
    iput-wide v0, p0, Ll/᩹۠ܺ;->ۧۙ:J

    return-void
.end method

.method public static ۙ()Ll/᩹۠ܺ;
    .locals 8

    .line 1298
    new-instance v0, Ll/᩹۠ܺ;

    invoke-direct {v0}, Ll/᩹۠ܺ;-><init>()V

    const-wide/16 v1, -0x1

    .line 1299
    iput-wide v1, v0, Ll/᩹۠ܺ;->ۧۙ:J

    .line 1301
    sget-object v1, Ll/ܽۖܺ;->᩶:Ll/ܽۖܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->ۢ:Ll/֡۠ܺ;

    .line 1302
    sget-object v2, Ll/ܳ۠ܺ;->ܿ:Ll/ܳ۠ܺ;

    iput-object v2, v0, Ll/᩹۠ܺ;->ۡ:Ll/ܳ۠ܺ;

    const/high16 v3, 0x3f800000    # 1.0f

    .line 1303
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, v0, Ll/᩹۠ܺ;->֨:Ljava/lang/Float;

    const/4 v5, 0x0

    .line 1304
    iput-object v5, v0, Ll/᩹۠ܺ;->ܽۙ:Ll/֡۠ܺ;

    .line 1305
    iput-object v4, v0, Ll/᩹۠ܺ;->ۛۙ:Ljava/lang/Float;

    .line 1306
    new-instance v6, Ll/ܿۖܺ;

    invoke-direct {v6, v3}, Ll/ܿۖܺ;-><init>(F)V

    iput-object v6, v0, Ll/᩹۠ܺ;->᩺ۙ:Ll/ܿۖܺ;

    .line 1307
    sget-object v3, Ll/ۚ۠ܺ;->᩶:Ll/ۚ۠ܺ;

    iput-object v3, v0, Ll/᩹۠ܺ;->ۗۙ:Ll/ۚ۠ܺ;

    .line 1308
    sget-object v3, Ll/֫۠ܺ;->ܿ:Ll/֫۠ܺ;

    iput-object v3, v0, Ll/᩹۠ܺ;->᩵ۙ:Ll/֫۠ܺ;

    const/high16 v3, 0x40800000    # 4.0f

    .line 1309
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    iput-object v3, v0, Ll/᩹۠ܺ;->ۨۙ:Ljava/lang/Float;

    .line 1310
    iput-object v5, v0, Ll/᩹۠ܺ;->ܶۙ:[Ll/ܿۖܺ;

    .line 1311
    new-instance v3, Ll/ܿۖܺ;

    const/4 v6, 0x0

    invoke-direct {v3, v6}, Ll/ܿۖܺ;-><init>(F)V

    iput-object v3, v0, Ll/᩹۠ܺ;->᩹ۙ:Ll/ܿۖܺ;

    .line 1312
    iput-object v4, v0, Ll/᩹۠ܺ;->ܳۙ:Ljava/lang/Float;

    .line 1313
    iput-object v1, v0, Ll/᩹۠ܺ;->֡:Ll/ܽۖܺ;

    .line 1314
    iput-object v5, v0, Ll/᩹۠ܺ;->ۖ:Ljava/util/ArrayList;

    .line 1315
    new-instance v3, Ll/ܿۖܺ;

    const/high16 v6, 0x41400000    # 12.0f

    sget-object v7, Ll/ܳۜܺ;->ۡ:Ll/ܳۜܺ;

    invoke-direct {v3, v6, v7}, Ll/ܿۖܺ;-><init>(FLl/ܳۜܺ;)V

    iput-object v3, v0, Ll/᩹۠ܺ;->۠:Ll/ܿۖܺ;

    const/16 v3, 0x190

    .line 1316
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Ll/᩹۠ܺ;->۬:Ljava/lang/Integer;

    .line 1317
    sget-object v3, Ll/۫۠ܺ;->ܿ:Ll/۫۠ܺ;

    iput-object v3, v0, Ll/᩹۠ܺ;->ۜ:Ll/۫۠ܺ;

    .line 1318
    sget-object v3, Ll/ܺ۠ܺ;->֡:Ll/ܺ۠ܺ;

    iput-object v3, v0, Ll/᩹۠ܺ;->ܰۙ:Ll/ܺ۠ܺ;

    .line 1319
    sget-object v3, Ll/ܽ۠ܺ;->᩶:Ll/ܽ۠ܺ;

    iput-object v3, v0, Ll/᩹۠ܺ;->۟:Ll/ܽ۠ܺ;

    .line 1320
    sget-object v3, Ll/᩻۠ܺ;->֡:Ll/᩻۠ܺ;

    iput-object v3, v0, Ll/᩹۠ܺ;->ۘۙ:Ll/᩻۠ܺ;

    .line 1321
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v3, v0, Ll/᩹۠ܺ;->۫ۙ:Ljava/lang/Boolean;

    .line 1322
    iput-object v5, v0, Ll/᩹۠ܺ;->ܰ:Ll/ۧۖܺ;

    .line 1323
    iput-object v5, v0, Ll/᩹۠ܺ;->᩸ۙ:Ljava/lang/String;

    .line 1324
    iput-object v5, v0, Ll/᩹۠ܺ;->ۤۙ:Ljava/lang/String;

    .line 1325
    iput-object v5, v0, Ll/᩹۠ܺ;->᩷ۙ:Ljava/lang/String;

    .line 1326
    iput-object v3, v0, Ll/᩹۠ܺ;->ᩳ:Ljava/lang/Boolean;

    .line 1327
    iput-object v3, v0, Ll/᩹۠ܺ;->۟ۙ:Ljava/lang/Boolean;

    .line 1328
    iput-object v1, v0, Ll/᩹۠ܺ;->᩻ۙ:Ll/֡۠ܺ;

    .line 1329
    iput-object v4, v0, Ll/᩹۠ܺ;->ܺۙ:Ljava/lang/Float;

    .line 1330
    iput-object v5, v0, Ll/᩹۠ܺ;->᩶:Ljava/lang/String;

    .line 1331
    iput-object v2, v0, Ll/᩹۠ܺ;->ܿ:Ll/ܳ۠ܺ;

    .line 1332
    iput-object v5, v0, Ll/᩹۠ܺ;->ᩴۙ:Ljava/lang/String;

    .line 1333
    iput-object v5, v0, Ll/᩹۠ܺ;->ۚۙ:Ll/֡۠ܺ;

    .line 1334
    iput-object v4, v0, Ll/᩹۠ܺ;->֫ۙ:Ljava/lang/Float;

    .line 1335
    iput-object v5, v0, Ll/᩹۠ܺ;->ܿۙ:Ll/֡۠ܺ;

    .line 1336
    iput-object v4, v0, Ll/᩹۠ܺ;->֡ۙ:Ljava/lang/Float;

    .line 1337
    sget-object v1, Ll/ܶ۠ܺ;->ܿ:Ll/ܶ۠ܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->᩶ۙ:Ll/ܶ۠ܺ;

    .line 1338
    sget-object v1, Ll/ۧ۠ܺ;->᩶:Ll/ۧ۠ܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->ۙۙ:Ll/ۧ۠ܺ;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1366
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹۠ܺ;

    .line 1367
    iget-object v1, p0, Ll/᩹۠ܺ;->ܶۙ:[Ll/ܿۖܺ;

    if-eqz v1, :cond_0

    .line 1368
    invoke-virtual {v1}, [Ll/ܿۖܺ;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ܿۖܺ;

    iput-object v1, v0, Ll/᩹۠ܺ;->ܶۙ:[Ll/ܿۖܺ;

    :cond_0
    return-object v0
.end method
