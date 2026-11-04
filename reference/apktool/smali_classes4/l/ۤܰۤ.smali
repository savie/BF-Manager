.class public final synthetic Ll/ۤܰۤ;
.super Ljava/lang/Object;
.source "G1PO"

# interfaces
.implements Ll/ܽۧܺ;
.implements Ll/ۤ֨ܳ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/ܶۤۧ;
.implements Ll/᩸ۛܽ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۤܰۤ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Landroid/widget/TextView;)V
    .locals 1

    iget-object v0, p0, Ll/ۤܰۤ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    .line 415
    invoke-static {p1, v0}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۤܰۤ;->ܰ:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/PluginUI;

    check-cast p1, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    invoke-static {v0, p1}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->$r8$lambda$lr8zokJiYLX0ZzHcXICzIfn6kRc(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    return-void
.end method

.method public construct()Ljava/lang/Object;
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ۤܰۤ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/Class;

    .line 366
    :try_start_0
    sget-object v1, Ll/ۗۛܽ;->ۙ:Ll/ۗۛܽ;

    invoke-virtual {v1, v0}, Ll/ۗۛܽ;->ۙ(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    .line 369
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Unable to create instance of "

    const-string v4, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    .line 0
    invoke-static {v0, v3, v4}, Ll/᩵ۨܽ;->ۙ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 369
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public ۙ(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۤܰۤ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩻ܰۤ;

    invoke-virtual {v0, p1}, Ll/ᩳۜۧ;->ۧ(I)V

    return-void
.end method

.method public ۙ(Landroid/content/Intent;I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۤܰۤ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ۘۖ֫;

    invoke-static {v0, p2, p1}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;ILandroid/content/Intent;)V

    return-void
.end method
