.class public final Ll/ۜܽ۫;
.super Ljava/lang/Object;
.source "195F"


# instance fields
.field public ۙ:Z

.field public final ۤ:I

.field public final ᩴ:Ll/֨ܽ۫;

.field public ᩷:Ljava/lang/String;

.field public final ᩸:Z


# direct methods
.method public constructor <init>(Ll/֨ܽ۫;Ll/ۨܽ۫;)V
    .locals 0

    .line 1287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1288
    iput-object p1, p0, Ll/ۜܽ۫;->ᩴ:Ll/֨ܽ۫;

    .line 1289
    iget p1, p2, Ll/ۨܽ۫;->ۜ:I

    invoke-static {p1}, Ll/ۙܶ۫;->᩷(I)I

    move-result p1

    iput p1, p0, Ll/ۜܽ۫;->ۤ:I

    .line 1290
    iget-boolean p1, p2, Ll/ۨܽ۫;->۬:Z

    iput-boolean p1, p0, Ll/ۜܽ۫;->᩸:Z

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 4

    .line 1309
    iget v0, p0, Ll/ۜܽ۫;->ۤ:I

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ۜܽ۫;->ᩴ:Ll/֨ܽ۫;

    iget-boolean v3, p0, Ll/ۜܽ۫;->᩸:Z

    if-ne v0, v1, :cond_2

    .line 1310
    iget-boolean v0, p0, Ll/ۜܽ۫;->ۙ:Z

    if-nez v0, :cond_0

    if-nez v3, :cond_3

    .line 1343
    :cond_0
    iget-object v0, p0, Ll/ۜܽ۫;->᩷:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1344
    invoke-interface {v2, v0}, Ll/֨ܽ۫;->ۙ(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1345
    iput-object v0, p0, Ll/ۜܽ۫;->᩷:Ljava/lang/String;

    .line 1312
    :cond_1
    invoke-interface {v2}, Ll/֨ܽ۫;->ۙ()V

    return-void

    .line 1314
    :cond_2
    iget-boolean v0, p0, Ll/ۜܽ۫;->ۙ:Z

    if-nez v0, :cond_4

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    return-void

    .line 1315
    :cond_4
    :goto_0
    invoke-interface {v2}, Ll/֨ܽ۫;->ۙ()V

    return-void
.end method

.method public final ۙ(C)V
    .locals 2

    .line 1343
    iget-object v0, p0, Ll/ۜܽ۫;->᩷:Ljava/lang/String;

    iget-object v1, p0, Ll/ۜܽ۫;->ᩴ:Ll/֨ܽ۫;

    if-eqz v0, :cond_0

    .line 1344
    invoke-interface {v1, v0}, Ll/֨ܽ۫;->ۙ(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1345
    iput-object v0, p0, Ll/ۜܽ۫;->᩷:Ljava/lang/String;

    .line 1295
    :cond_0
    invoke-interface {v1, p1}, Ll/֨ܽ۫;->᩷(C)V

    const/4 p1, 0x1

    .line 1296
    iput-boolean p1, p0, Ll/ۜܽ۫;->ۙ:Z

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 1300
    iget-object v2, p0, Ll/ۜܽ۫;->ᩴ:Ll/֨ܽ۫;

    iget-boolean v3, p0, Ll/ۜܽ۫;->᩸:Z

    iget v4, p0, Ll/ۜܽ۫;->ۤ:I

    if-ne v4, v0, :cond_3

    .line 1323
    iget-boolean v0, p0, Ll/ۜܽ۫;->ۙ:Z

    if-nez v0, :cond_0

    if-nez v3, :cond_2

    .line 1343
    :cond_0
    iget-object v0, p0, Ll/ۜܽ۫;->᩷:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1344
    invoke-interface {v2, v0}, Ll/֨ܽ۫;->ۙ(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1345
    iput-object v0, p0, Ll/ۜܽ۫;->᩷:Ljava/lang/String;

    .line 1325
    :cond_1
    invoke-interface {v2}, Ll/֨ܽ۫;->ۙ()V

    .line 1328
    :cond_2
    iput-boolean v1, p0, Ll/ۜܽ۫;->ۙ:Z

    .line 1302
    iput-object p1, p0, Ll/ۜܽ۫;->᩷:Ljava/lang/String;

    return-void

    :cond_3
    if-eqz v3, :cond_4

    .line 1332
    iget-boolean v0, p0, Ll/ۜܽ۫;->ۙ:Z

    if-nez v0, :cond_4

    return-void

    :cond_4
    if-nez v4, :cond_5

    .line 1336
    invoke-interface {v2, p1}, Ll/֨ܽ۫;->ۙ(Ljava/lang/String;)V

    .line 1338
    :cond_5
    invoke-interface {v2}, Ll/֨ܽ۫;->ۙ()V

    .line 1339
    iput-boolean v1, p0, Ll/ۜܽ۫;->ۙ:Z

    return-void
.end method
