.class public final Ll/۟ܽ;
.super Ll/ܿܽ;
.source "A513"


# virtual methods
.method public final ᩴ()V
    .locals 5

    .line 119
    invoke-super {p0}, Ll/ܿܽ;->ᩴ()V

    .line 318
    :try_start_0
    iget-object v0, p0, Ll/ܿܽ;->ᩴ:Ll/ܳ֫;

    invoke-virtual {v0}, Ll/ܳ֫;->᩸()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 344
    :cond_0
    invoke-virtual {v0}, Ll/ܳ֫;->ۤ()Ll/᩸֫;

    move-result-object v0

    invoke-interface {v0}, Ll/ܺ֫;->᩸()Landroid/widget/ListView;

    move-result-object v0

    .line 128
    :goto_0
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    .line 129
    instance-of v2, v1, Landroid/widget/HeaderViewListAdapter;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Landroid/widget/HeaderViewListAdapter;

    .line 130
    invoke-virtual {v2}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    check-cast v2, Ll/֡ۚ;

    .line 131
    const-class v3, Ll/֡ۚ;

    const-string v4, "\u06df"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    const/4 v4, 0x1

    .line 132
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const v4, 0x7f0d0189

    .line 133
    invoke-virtual {v3, v2, v4}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 135
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 136
    invoke-virtual {v2}, Ll/֡ۚ;->notifyDataSetChanged()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
