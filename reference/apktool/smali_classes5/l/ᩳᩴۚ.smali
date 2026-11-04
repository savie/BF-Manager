.class public final Ll/ᩳᩴۚ;
.super Ll/۫۟᩷;
.source "26HN"


# instance fields
.field public final synthetic ۙ:Ll/ۡᩴۚ;


# direct methods
.method public constructor <init>(Ll/ۡᩴۚ;)V
    .locals 0

    .line 328
    iput-object p1, p0, Ll/ᩳᩴۚ;->ۙ:Ll/ۡᩴۚ;

    invoke-direct {p0}, Ll/۫۟᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 342
    iget-object v0, p0, Ll/ᩳᩴۚ;->ۙ:Ll/ۡᩴۚ;

    invoke-static {v0}, Ll/ۡᩴۚ;->᩸(Ll/ۡᩴۚ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItemId(I)J
    .locals 2

    .line 347
    iget-object v0, p0, Ll/ᩳᩴۚ;->ۙ:Ll/ۡᩴۚ;

    invoke-static {v0}, Ll/ۡᩴۚ;->᩸(Ll/ۡᩴۚ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬᩷ۚ;

    iget-wide v0, p1, Ll/۬᩷ۚ;->᩸:J

    return-wide v0
.end method

.method public final onBindViewHolder(Ll/ۧᩳ᩷;I)V
    .locals 1

    .line 328
    check-cast p1, Ll/֨ᩴۚ;

    .line 337
    iget-object v0, p0, Ll/ᩳᩴۚ;->ۙ:Ll/ۡᩴۚ;

    invoke-static {v0}, Ll/ۡᩴۚ;->᩸(Ll/ۡᩴۚ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۬᩷ۚ;

    invoke-virtual {p1, p2}, Ll/֨ᩴۚ;->ۙ(Ll/۬᩷ۚ;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۧᩳ᩷;
    .locals 2

    .line 332
    new-instance p2, Ll/֨ᩴۚ;

    const v0, 0x7f0d0168

    const/4 v1, 0x0

    .line 0
    invoke-static {p1, v0, p1, v1}, Ll/۟۠֫;->ۙ(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 332
    iget-object v0, p0, Ll/ᩳᩴۚ;->ۙ:Ll/ۡᩴۚ;

    invoke-direct {p2, v0, p1}, Ll/֨ᩴۚ;-><init>(Ll/ۡᩴۚ;Landroid/view/View;)V

    return-object p2
.end method
