.class public final synthetic Ll/ܰܺ۫;
.super Ljava/lang/Object;
.source "795C"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/۫ۛܳ;

.field public final synthetic ܿ:Ll/᩹ۖ᩸;

.field public final synthetic ᩶:Ll/۠ۨܳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۛܳ;Ll/۠ۨܳ;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰܺ۫;->ܰ:Ll/۫ۛܳ;

    iput-object p2, p0, Ll/ܰܺ۫;->᩶:Ll/۠ۨܳ;

    iput-object p3, p0, Ll/ܰܺ۫;->ܿ:Ll/᩹ۖ᩸;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 91
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 94
    iget-object v1, p0, Ll/ܰܺ۫;->ܰ:Ll/۫ۛܳ;

    invoke-virtual {v1}, Ll/۫ۛܳ;->۫()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/String;

    invoke-static {v2, v4}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v2

    .line 95
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v4

    .line 96
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    const v6, 0x7f120a7e

    if-eqz v5, :cond_0

    .line 97
    invoke-static {v6}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v4

    .line 98
    :cond_0
    invoke-virtual {v1}, Ll/۫ۛܳ;->ᩴ()Ll/۠ۨܳ;

    move-result-object v5

    invoke-virtual {v5}, Ll/۠ۨܳ;->۠()Z

    move-result v5

    const/4 v7, 0x1

    const v8, 0x7f120211

    const v9, 0x7f120210

    if-eqz v5, :cond_1

    new-array v5, v7, [Ljava/lang/Object;

    aput-object v4, v5, v3

    .line 99
    invoke-static {v9, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-array v5, v7, [Ljava/lang/Object;

    aput-object v4, v5, v3

    .line 101
    invoke-static {v8, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    :goto_0
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    iget-object v2, p0, Ll/ܰܺ۫;->᩶:Ll/۠ۨܳ;

    invoke-virtual {v2}, Ll/۠ۨܳ;->ۗ()Ljava/lang/String;

    move-result-object v4

    new-array v5, v3, [Ljava/lang/String;

    invoke-static {v4, v5}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v4

    .line 107
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v5

    .line 108
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 109
    invoke-static {v6}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v5

    .line 110
    :cond_2
    invoke-virtual {v2}, Ll/۠ۨܳ;->۠()Z

    move-result v2

    if-eqz v2, :cond_3

    new-array v2, v7, [Ljava/lang/Object;

    aput-object v5, v2, v3

    .line 111
    invoke-static {v9, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 112
    invoke-virtual {p1, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-array v2, v7, [Ljava/lang/Object;

    aput-object v5, v2, v3

    .line 114
    invoke-static {v8, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    :goto_1
    invoke-virtual {v1}, Ll/۫ۛܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/CharSequence;

    new-instance v2, Ll/ܿܺ۫;

    iget-object v3, p0, Ll/ܰܺ۫;->ܿ:Ll/᩹ۖ᩸;

    invoke-direct {v2, v3, p1}, Ll/ܿܺ۫;-><init>(Ll/᩹ۖ᩸;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v0, v2}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 121
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method
