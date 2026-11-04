.class public final Ll/᩵᩶ۗ;
.super Ll/ܺ᩶ۗ;
.source "UIUV"


# instance fields
.field public final ܰ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Ll/᩵᩶ۗ;->ܰ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EXCEPTIONS:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩵᩶ۗ;->ܰ:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 22
    sget-object v0, Ll/᩻᩶ۗ;->ܳ:Ll/᩻᩶ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 17
    iget-object v0, p0, Ll/᩵᩶ۗ;->ܰ:Ljava/util/List;

    return-object v0
.end method
