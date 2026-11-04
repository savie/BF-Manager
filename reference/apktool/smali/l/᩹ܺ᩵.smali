.class public final Ll/᩹ܺ᩵;
.super Ljava/lang/Object;
.source "R6HA"

# interfaces
.implements Ll/ۖܰۗ;


# instance fields
.field public ۙ:I

.field public final ۤ:Ll/ۛܺ᩵;

.field public ܳ:I

.field public ᩴ:Ll/᩵ܺ᩵;

.field public ᩷:I

.field public ᩸:Ll/᩻ܺ᩵;


# direct methods
.method public constructor <init>(Ll/ۛܺ᩵;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/᩹ܺ᩵;->ۤ:Ll/ۛܺ᩵;

    return-void
.end method


# virtual methods
.method public final getAttributes()Ljava/util/ArrayList;
    .locals 3

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    iget v1, p0, Ll/᩹ܺ᩵;->᩷:I

    iget-object v2, p0, Ll/᩹ܺ᩵;->ۤ:Ll/ۛܺ᩵;

    invoke-virtual {v2, v1}, Ll/ۛܺ᩵;->ۙ(I)Ljava/util/List;

    move-result-object v1

    .line 80
    invoke-static {v0, v1}, Ll/֫ܺ᩵;->᩷(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 74
    iget v1, p0, Ll/᩹ܺ᩵;->ܳ:I

    invoke-virtual {v2, v1}, Ll/ۛܺ᩵;->᩷(I)Ljava/util/List;

    move-result-object v1

    .line 81
    invoke-static {v1}, Ll/᩹᩶ۗ;->ۙ(Ljava/util/List;)Ll/᩹᩶ۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/᩹ܺ᩵;->ᩴ:Ll/᩵ܺ᩵;

    .line 94
    invoke-virtual {v0}, Ll/᩵ܺ᩵;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/᩵ܺ᩵;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/᩹ܺ᩵;->ᩴ:Ll/᩵ܺ᩵;

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 0

    .line 48
    iput p1, p0, Ll/᩹ܺ᩵;->ۙ:I

    return-void
.end method

.method public final ۙ(Ll/᩵ܺ᩵;)V
    .locals 0

    .line 39
    iput-object p1, p0, Ll/᩹ܺ᩵;->ᩴ:Ll/᩵ܺ᩵;

    return-void
.end method

.method public final ۙ(Ll/᩻ܺ᩵;)V
    .locals 0

    .line 58
    iput-object p1, p0, Ll/᩹ܺ᩵;->᩸:Ll/᩻ܺ᩵;

    return-void
.end method

.method public final ۤ()Ll/᩵ܺ᩵;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/᩹ܺ᩵;->ᩴ:Ll/᩵ܺ᩵;

    return-object v0
.end method

.method public final ۤ(I)V
    .locals 0

    .line 66
    iput p1, p0, Ll/᩹ܺ᩵;->ܳ:I

    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 44
    iget v0, p0, Ll/᩹ܺ᩵;->ۙ:I

    return v0
.end method

.method public final ᩷(I)V
    .locals 0

    .line 62
    iput p1, p0, Ll/᩹ܺ᩵;->᩷:I

    return-void
.end method

.method public final ᩸()Ll/᩻ܺ᩵;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/᩹ܺ᩵;->᩸:Ll/᩻ܺ᩵;

    return-object v0
.end method
