.class public final synthetic Ll/᩶ۗۧ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ll/᩶ۚܺ;
.implements Ll/ܽۧܺ;
.implements Ll/ۧۧۧ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩶ۗۧ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩶ۗۧ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/util/HashSet;

    .line 6
    check-cast p1, Ll/ܰ᩹ۧ;

    .line 469
    invoke-interface {p1}, Ll/ܰ᩹ۧ;->ᩴ()Ll/᩸ۤۛ;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 473
    :cond_0
    invoke-virtual {p1}, Ll/᩸ۤۛ;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 476
    :cond_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public ۙ(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩶ۗۧ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ۤܽ۫;

    invoke-virtual {v0, p1}, Ll/ᩴۙ᩻;->ܺ(I)V

    return-void
.end method

.method public ᩷()Landroid/graphics/Bitmap;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩶ۗۧ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩷ۨᩴ;

    .line 338
    new-instance v1, Ll/ۡ֡᩻;

    invoke-direct {v1, v0}, Ll/ۡ֡᩻;-><init>(Ll/᩷ۨᩴ;)V

    .line 211
    invoke-static {v1}, Ll/۠֡᩻;->ۙ(Ll/֨֡᩻;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
