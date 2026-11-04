.class public final synthetic Ll/᩸ܰۤ;
.super Ljava/lang/Object;
.source "G1PO"

# interfaces
.implements Ll/ܽ᩷᩷;
.implements Lbin/mt/plugin/api/util/Consumer;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ܰۤ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩸ܰۤ;->ܰ:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/PluginTextView;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginTextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
