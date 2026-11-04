.class public final synthetic Ll/۠ܺۧ;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/ܰܽ;
.implements Ll/֫۫ۧ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۠ܺۧ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/۠ܺۧ;->ܰ:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->$r8$lambda$RXRVdOP2Ops8JetgN5e2AF0jW18(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۙ(Ll/ܿܽ;)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/۠ܺۧ;->ܰ:Ljava/lang/Object;

    check-cast p1, Ll/᩵ܽۧ;

    invoke-static {p1}, Ll/᩵ܽۧ;->᩷(Ll/᩵ܽۧ;)V

    return-void
.end method

.method public ᩷()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/۠ܺۧ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩻᩹ۧ;

    invoke-static {v0}, Ll/᩻᩹ۧ;->᩸(Ll/᩻᩹ۧ;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
