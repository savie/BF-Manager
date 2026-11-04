.class public final Ll/ܺᩳۗ;
.super Ll/ܺ᩶ۗ;
.source "26DF"


# instance fields
.field public final ܰ:Ll/ۖۡۗ;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Ll/ܺᩳۗ;->ܰ:Ll/ۖۡۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BRIDGED_BY: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܺᩳۗ;->ܰ:Ll/ۖۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 7
    sget-object v0, Ll/ۧ۟ۗ;->᩷:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ll/ۖۡۗ;
    .locals 1

    .line 16
    iget-object v0, p0, Ll/ܺᩳۗ;->ܰ:Ll/ۖۡۗ;

    return-object v0
.end method
