.class public final synthetic Ll/֡ܽۚ;
.super Ljava/lang/Object;
.source "G7AI"

# interfaces
.implements Ll/֫ܶۚ;


# instance fields
.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ۤ:Ll/᩻ܶۚ;

.field public final synthetic ᩷:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/ArrayList;Ll/᩻ܶۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܽۚ;->ۙ:Ljava/lang/String;

    iput-object p2, p0, Ll/֡ܽۚ;->᩷:Ljava/util/ArrayList;

    iput-object p3, p0, Ll/֡ܽۚ;->ۤ:Ll/᩻ܶۚ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/۫ܶۚ;)Z
    .locals 4

    const-string v0, "*"

    .line 134
    iget-object v1, p0, Ll/֡ܽۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 136
    iget-object v0, p0, Ll/֡ܽۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖܳۤ;

    .line 137
    iget v2, p1, Ll/۫ܶۚ;->ۙ:I

    invoke-interface {v1, v2}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1260
    :cond_1
    iget-object v0, p0, Ll/֡ܽۚ;->ۤ:Ll/᩻ܶۚ;

    iget-object v1, v0, Ll/᩻ܶۚ;->ۙ:Ljava/util/ArrayList;

    iget v2, v0, Ll/᩻ܶۚ;->᩸:I

    iget v3, v0, Ll/᩻ܶۚ;->ۤ:I

    if-lt v2, v3, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, v0, Ll/᩻ܶۚ;->᩷:I

    if-ge v2, v3, :cond_2

    .line 1261
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1263
    :cond_2
    iget p1, v0, Ll/᩻ܶۚ;->᩸:I

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Ll/᩻ܶۚ;->᩸:I

    :cond_3
    const/4 p1, 0x0

    return p1
.end method
