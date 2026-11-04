.class public final Ll/ܶ᩶ۗ;
.super Ll/ܺ᩶ۗ;
.source "06GW"


# instance fields
.field public final ܰ:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/ܶ᩶ۗ;->ܰ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ANNOTATION_DEFAULT_CLASS: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܶ᩶ۗ;->ܰ:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 25
    sget-object v0, Ll/᩻᩶ۗ;->᩷:Ll/᩻᩶ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/Map;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ܶ᩶ۗ;->ܰ:Ljava/util/Map;

    return-object v0
.end method
