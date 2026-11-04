.class public final synthetic Ll/ܽ᩷᩻;
.super Ljava/lang/Object;
.source "N1TT"

# interfaces
.implements Ll/ۚۘܳ;
.implements Ll/ۧ᩵ܳ;
.implements Ll/ܽۧܺ;
.implements Ll/᩶ܽ;
.implements Lcom/google/android/material/internal/ViewUtils$OnApplyWindowInsetsListener;
.implements Ll/ܰ᩶᩺;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܽ᩷᩻;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Ll/ۘۜ;Lcom/google/android/material/internal/ViewUtils$RelativePadding;)Ll/ۘۜ;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽ᩷᩻;->ܰ:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/search/SearchView;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/material/search/SearchView;->$r8$lambda$kajH3YISJpjEqc1frQhPp6eys-c(Lcom/google/android/material/search/SearchView;Landroid/view/View;Ll/ۘۜ;Lcom/google/android/material/internal/ViewUtils$RelativePadding;)Ll/ۘۜ;

    move-result-object p1

    return-object p1
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽ᩷᩻;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ۛ᩷᩻;

    invoke-static {v0, p1}, Ll/ۛ᩷᩻;->ۙ(Ll/ۛ᩷᩻;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ۙ(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽ᩷᩻;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ۘܶ۫;

    invoke-virtual {v0, p1}, Ll/ᩳۜۧ;->ۧ(I)V

    return-void
.end method

.method public ۙ(JJ)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽ᩷᩻;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/۫۬ܳ;

    invoke-static {v0, p1, p2, p3, p4}, Ll/۫۬ܳ;->ۙ(Ll/۫۬ܳ;JJ)V

    return-void
.end method

.method public ۙ(Ll/ۧܿ᩺;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܽ᩷᩻;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۙۨۘ;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    check-cast p1, Ll/᩺᩶᩺;

    const/4 v1, 0x0

    .line 778
    invoke-virtual {v0, v1, p1}, Ll/ۙۨۘ;->ۙ(Ll/ᩳܰۘ;Ll/᩺᩶᩺;)V

    return-void
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܽ᩷᩻;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠ۨܳ;

    .line 1744
    invoke-static {v0, p1}, Ll/ۗ۟ۤ;->ۙ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V

    return-void
.end method

.method public synthetic ۤ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
