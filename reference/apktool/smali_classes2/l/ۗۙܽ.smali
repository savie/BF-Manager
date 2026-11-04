.class public final Ll/ۗۙܽ;
.super Ljava/lang/Object;
.source "55BL"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public ۤ:Ll/᩹ۙܽ;

.field public final ᩷:Ll/᩹ۙܽ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    new-instance v0, Ll/᩹ۙܽ;

    .line 455
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 150
    iput-object v0, p0, Ll/ۗۙܽ;->᩷:Ll/᩹ۙܽ;

    .line 151
    iput-object v0, p0, Ll/ۗۙܽ;->ۤ:Ll/᩹ۙܽ;

    .line 157
    iput-object p1, p0, Ll/ۗۙܽ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method private ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 429
    new-instance v0, Ll/ܶۙܽ;

    .line 455
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 430
    iget-object v1, p0, Ll/ۗۙܽ;->ۤ:Ll/᩹ۙܽ;

    iput-object v0, v1, Ll/᩹ۙܽ;->᩷:Ll/᩹ۙܽ;

    iput-object v0, p0, Ll/ۗۙܽ;->ۤ:Ll/᩹ۙܽ;

    .line 444
    iput-object p2, v0, Ll/᩹ۙܽ;->ۤ:Ljava/lang/Object;

    .line 445
    iput-object p1, v0, Ll/᩹ۙܽ;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 380
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v1, p0, Ll/ۗۙܽ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 381
    iget-object v1, p0, Ll/ۗۙܽ;->᩷:Ll/᩹ۙܽ;

    iget-object v1, v1, Ll/᩹ۙܽ;->᩷:Ll/᩹ۙܽ;

    const-string v2, ""

    :goto_0
    if-eqz v1, :cond_2

    .line 384
    iget-object v3, v1, Ll/᩹ۙܽ;->ۤ:Ljava/lang/Object;

    .line 389
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    iget-object v2, v1, Ll/᩹ۙܽ;->ۙ:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 393
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    if-eqz v3, :cond_1

    .line 395
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    .line 397
    invoke-static {v4}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 398
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {v0, v3, v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 400
    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 383
    :goto_1
    iget-object v1, v1, Ll/᩹ۙܽ;->᩷:Ll/᩹ۙܽ;

    const-string v2, ", "

    goto :goto_0

    :cond_2
    const/16 v1, 0x7d

    .line 404
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(JLjava/lang/String;)V
    .locals 0

    .line 258
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p3, p1}, Ll/ۗۙܽ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/Object;)V
    .locals 2

    .line 408
    new-instance v0, Ll/᩹ۙܽ;

    .line 455
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 409
    iget-object v1, p0, Ll/ۗۙܽ;->ۤ:Ll/᩹ۙܽ;

    iput-object v0, v1, Ll/᩹ۙܽ;->᩷:Ll/᩹ۙܽ;

    iput-object v0, p0, Ll/ۗۙܽ;->ۤ:Ll/᩹ۙܽ;

    .line 416
    iput-object p1, v0, Ll/᩹ۙܽ;->ۤ:Ljava/lang/Object;

    return-void
.end method

.method public final ۙ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 408
    new-instance v0, Ll/᩹ۙܽ;

    .line 455
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 409
    iget-object v1, p0, Ll/ۗۙܽ;->ۤ:Ll/᩹ۙܽ;

    iput-object v0, v1, Ll/᩹ۙܽ;->᩷:Ll/᩹ۙܽ;

    iput-object v0, p0, Ll/ۗۙܽ;->ۤ:Ll/᩹ۙܽ;

    .line 423
    iput-object p1, v0, Ll/᩹ۙܽ;->ۤ:Ljava/lang/Object;

    .line 424
    iput-object p2, v0, Ll/᩹ۙܽ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public final ۙ(Ljava/lang/String;I)V
    .locals 0

    .line 248
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/ۗۙܽ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;Z)V
    .locals 0

    .line 208
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/ۗۙܽ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
