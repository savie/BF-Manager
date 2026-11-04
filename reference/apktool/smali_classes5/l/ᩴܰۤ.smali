.class public final synthetic Ll/ᩴܰۤ;
.super Ljava/lang/Object;
.source "G1PO"

# interfaces
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/ܿ֫ܺ;
.implements Lcom/google/android/material/canvas/CanvasCompat$CanvasOperation;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ᩴܰۤ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩴܰۤ;->ܰ:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->$r8$lambda$QWmsr9SOaqSJq5dogzEk6LuF6sM(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public run(Landroid/graphics/Canvas;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩴܰۤ;->ܰ:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    invoke-static {v0, p1}, Lcom/google/android/material/navigation/NavigationView;->$r8$lambda$AHFKJHmjzrzMxPjc--xxWf1dl_U(Lcom/google/android/material/navigation/NavigationView;Landroid/graphics/Canvas;)V

    return-void
.end method

.method public ۙ(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ᩴܰۤ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩵ܽۧ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/᩵ܽۧ;->᩷(Ljava/lang/String;)V

    return-void
.end method
