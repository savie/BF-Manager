.class public final Ll/᩹ۡ;
.super Ljava/lang/Object;
.source "JB1Y"


# instance fields
.field public final ۙ:Ll/ܽۡ;


# direct methods
.method public constructor <init>(Ll/ܽۡ;)V
    .locals 0

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    iput-object p1, p0, Ll/᩹ۡ;->ۙ:Ll/ܽۡ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 184
    iget-object v0, p0, Ll/᩹ۡ;->ۙ:Ll/ܽۡ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Landroid/content/ClipData;
    .locals 1

    .line 192
    iget-object v0, p0, Ll/᩹ۡ;->ۙ:Ll/ܽۡ;

    invoke-interface {v0}, Ll/ܽۡ;->᩷()Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public final ۤ()I
    .locals 1

    .line 201
    iget-object v0, p0, Ll/᩹ۡ;->ۙ:Ll/ܽۡ;

    invoke-interface {v0}, Ll/ܽۡ;->getSource()I

    move-result v0

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 209
    iget-object v0, p0, Ll/᩹ۡ;->ۙ:Ll/ܽۡ;

    invoke-interface {v0}, Ll/ܽۡ;->۫()I

    move-result v0

    return v0
.end method

.method public final ᩸()Landroid/view/ContentInfo;
    .locals 1

    .line 178
    iget-object v0, p0, Ll/᩹ۡ;->ۙ:Ll/ܽۡ;

    invoke-interface {v0}, Ll/ܽۡ;->ۙ()Landroid/view/ContentInfo;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
