.class public final Ll/ۛ᩶ۗ;
.super Ljava/lang/Object;
.source "LISZ"


# instance fields
.field public final ۙ:I

.field public final ۤ:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ll/ۛ᩶ۗ;->᩷:Ljava/lang/String;

    .line 16
    iput-object p3, p0, Ll/ۛ᩶ۗ;->᩸:Ljava/lang/String;

    .line 17
    iput-object p4, p0, Ll/ۛ᩶ۗ;->ۤ:Ljava/lang/String;

    .line 18
    iput p2, p0, Ll/ۛ᩶ۗ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InnerCls{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۛ᩶ۗ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", outerCls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛ᩶ۗ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛ᩶ۗ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", accessFlags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۛ᩶ۗ;->ۙ:I

    sget-object v2, Ll/֡ܰۗ;->᩶:Ll/֡ܰۗ;

    .line 42
    invoke-static {v1, v2}, Ll/ܿܰۗ;->ۙ(ILl/֡ܰۗ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()I
    .locals 1

    .line 34
    iget v0, p0, Ll/ۛ᩶ۗ;->ۙ:I

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ۛ᩶ۗ;->᩸:Ljava/lang/String;

    return-object v0
.end method
