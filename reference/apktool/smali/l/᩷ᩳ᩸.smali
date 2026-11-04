.class public final synthetic Ll/᩷ᩳ᩸;
.super Ljava/lang/Object;
.source "O6S3"

# interfaces
.implements Ll/֫ܶ᩵;
.implements Ll/ۗܽۤ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩷ᩳ᩸;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩷ᩳ᩸;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩷ᩳ᩸;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ᩷(I)Ll/ܳܽۤ;
    .locals 6

    .line 2
    iget-object v0, p0, Ll/᩷ᩳ᩸;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩷ۨᩴ;

    .line 6
    iget-object v1, p0, Ll/᩷ᩳ᩸;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v1, Ll/֡ܿ᩹;

    .line 10
    iget-object v2, p0, Ll/᩷ᩳ᩸;->ܿ:Ljava/lang/Object;

    .line 12
    check-cast v2, Ll/֨֨;

    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x2e

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    const/16 v0, 0x64

    const/16 v4, 0x30

    if-ge p1, v0, :cond_0

    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const/16 v0, 0xa

    if-ge p1, v0, :cond_1

    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    invoke-static {v0, v3}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    const-string v3, "rw"

    .line 43
    invoke-virtual {v0, v3}, Ll/᩷ۨᩴ;->֫(Ljava/lang/String;)Ll/ܳܽۤ;

    move-result-object v3

    .line 44
    invoke-virtual {v1, p1}, Ll/֡ܿ᩹;->add(I)Z

    move-result p1

    if-eqz p1, :cond_2

    const-wide/16 v4, 0x0

    .line 45
    invoke-interface {v3, v4, v5}, Ll/ܳܽۤ;->setLength(J)V

    .line 46
    invoke-interface {v2, v0}, Ll/֨֨;->accept(Ljava/lang/Object;)V

    :cond_2
    return-object v3
.end method

.method public ᩷(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/᩷ᩳ᩸;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ᩴᩳ᩸;

    iget-object v1, p0, Ll/᩷ᩳ᩸;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/᩸ᩳ᩸;

    iget-object v2, p0, Ll/᩷ᩳ᩸;->ܿ:Ljava/lang/Object;

    check-cast v2, Ll/ۢۢ᩸;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, v1, v2, p2}, Ll/ᩴᩳ᩸;->ۙ(Ll/ᩴᩳ᩸;Ll/᩸ᩳ᩸;Ll/ۢۢ᩸;Ljava/lang/Throwable;)V

    return-void
.end method
