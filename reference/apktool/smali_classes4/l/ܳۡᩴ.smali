.class public final Ll/ܳۡᩴ;
.super Ljava/lang/Object;
.source "K7A7"


# direct methods
.method public static ۙ(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/۠ۨܳ;I)V
    .locals 3

    const-string v0, "local"

    .line 86
    invoke-virtual {p2, v0}, Ll/۠ۨܳ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 89
    :cond_0
    invoke-virtual {p2}, Ll/۠ۨܳ;->ۨ()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    invoke-static {p2, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p2

    .line 90
    invoke-virtual {p2}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const v1, 0x7f120a7e

    .line 92
    invoke-static {v1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v1

    :cond_1
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v0

    .line 94
    invoke-static {p3, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;Ljava/lang/Runnable;Ll/᩹ۖ᩸;)V
    .locals 5

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 71
    instance-of v2, p0, Lbin/mt/plus/Main;

    if-eqz v2, :cond_1

    move-object v2, p0

    check-cast v2, Lbin/mt/plus/Main;

    .line 74
    invoke-virtual {v2}, Lbin/mt/plus/Main;->ۧۙ()Ll/ᩴ᩶ܳ;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v2}, Ll/ᩴ᩶ܳ;->֫()Ll/۠ۨܳ;

    move-result-object v3

    const v4, 0x7f120210

    invoke-static {v0, v1, v3, v4}, Ll/ܳۡᩴ;->ۙ(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/۠ۨܳ;I)V

    .line 79
    invoke-virtual {v2}, Ll/ᩴ᩶ܳ;->᩻()Ll/۠ۨܳ;

    move-result-object v2

    const v3, 0x7f120211

    invoke-static {v0, v1, v2, v3}, Ll/ܳۡᩴ;->ۙ(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/۠ۨܳ;I)V

    :cond_1
    :goto_0
    const v2, 0x7f120ba3

    .line 47
    invoke-static {v2}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    sget-object v2, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-static {}, Ll/ܽܿᩴ;->᩷()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺܿᩴ;

    .line 50
    iget-object v4, v3, Ll/ܺܿᩴ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    iget-object v3, v3, Ll/ܺܿᩴ;->ۤ:Ljava/io/File;

    invoke-static {v3}, Ll/ܰۨᩴ;->ۙ(Ljava/io/File;)Ll/᩷ۨᩴ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    const v2, 0x7f120ae6

    .line 54
    invoke-static {v2}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    :cond_3
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/CharSequence;

    new-instance v2, Ll/֨ۛܳ;

    const/4 v3, 0x1

    invoke-direct {v2, p1, v0, p2, v3}, Ll/֨ۛܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v1, v2}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 63
    invoke-virtual {p0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;Ll/֫ۖ᩸;Ll/᩹ۖ᩸;Ll/ᩳۤۚ;)V
    .locals 1

    const/4 v0, -0x1

    .line 41
    invoke-virtual {p1, v0}, Ll/֫ۖ᩸;->᩷(I)V

    const v0, 0x7f08023e

    .line 42
    invoke-virtual {p1, v0}, Ll/֫ۖ᩸;->ۙ(I)V

    .line 43
    new-instance v0, Ll/ᩴۡᩴ;

    invoke-direct {v0, p0, p3, p2}, Ll/ᩴۡᩴ;-><init>(Ll/ܽ֡֫;Ljava/lang/Runnable;Ll/᩹ۖ᩸;)V

    invoke-virtual {p1, v0}, Ll/֫ۖ᩸;->ۙ(Landroid/view/View$OnClickListener;)V

    return-void
.end method
