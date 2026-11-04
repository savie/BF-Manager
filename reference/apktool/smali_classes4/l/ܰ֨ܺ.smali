.class public final synthetic Ll/ܰ֨ܺ;
.super Ljava/lang/Object;
.source "X565"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic ܰ:Ll/֡֨ܺ;

.field public final synthetic ᩶:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ll/֡֨ܺ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ܰ֨ܺ;->ܰ:Ll/֡֨ܺ;

    iput-object p1, p0, Ll/ܰ֨ܺ;->᩶:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 0
    iget-object p1, p0, Ll/ܰ֨ܺ;->ܰ:Ll/֡֨ܺ;

    iget-object v0, p0, Ll/ܰ֨ܺ;->᩶:Landroid/content/Context;

    invoke-static {v0, p1}, Ll/۟֨ܺ;->᩷(Landroid/content/Context;Ll/֡֨ܺ;)V

    return-void
.end method
