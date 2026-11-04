.class public Ll/ܰܳ;
.super Ll/ۧۤ;
.source "34P4"

# interfaces
.implements Ll/ܰᩴ;


# instance fields
.field public mDelegate:Ll/֨ᩴ;

.field public final mKeyDispatcher:Ll/ۘۡ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, v0}, Ll/ܰܳ;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 55
    invoke-static {p1, p2}, Ll/ܰܳ;->getThemeResId(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Ll/ۧۤ;-><init>(Landroid/content/Context;I)V

    .line 47
    new-instance v0, Ll/ۘܳ;

    invoke-direct {v0, p0}, Ll/ۘܳ;-><init>(Ll/ܰܳ;)V

    iput-object v0, p0, Ll/ܰܳ;->mKeyDispatcher:Ll/ۘۡ;

    .line 57
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    .line 59
    invoke-static {p1, p2}, Ll/ܰܳ;->getThemeResId(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/֨ᩴ;->ᩴ(I)V

    .line 65
    invoke-virtual {v0}, Ll/֨ᩴ;->֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Ll/ۧۤ;-><init>(Landroid/content/Context;)V

    .line 47
    new-instance p1, Ll/ۘܳ;

    invoke-direct {p1, p0}, Ll/ۘܳ;-><init>(Ll/ܰܳ;)V

    iput-object p1, p0, Ll/ܰܳ;->mKeyDispatcher:Ll/ۘۡ;

    .line 71
    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 72
    invoke-virtual {p0, p3}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-void
.end method

.method public static getThemeResId(Landroid/content/Context;I)I
    .locals 2

    if-nez p1, :cond_0

    .line 189
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 190
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    const v0, 0x7f04018b

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 191
    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    return p0

    :cond_0
    return p1
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 132
    invoke-virtual {p0}, Ll/ۧۤ;->initializeViewTreeOwners()V

    .line 133
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/֨ᩴ;->ۙ(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public dismiss()V
    .locals 1

    .line 144
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 146
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩴ;->ۧ()V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 217
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 218
    iget-object v1, p0, Ll/ܰܳ;->mKeyDispatcher:Ll/ۘۡ;

    invoke-static {v1, v0, p0, p1}, Ll/ܰۡ;->ۙ(Ll/ۘۡ;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1

    .line 115
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֨ᩴ;->ۙ(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getDelegate()Ll/֨ᩴ;
    .locals 1

    .line 180
    iget-object v0, p0, Ll/ܰܳ;->mDelegate:Ll/֨ᩴ;

    if-nez v0, :cond_0

    .line 181
    sget-object v0, Ll/֨ᩴ;->֨:Ll/ᩳᩴ;

    .line 323
    new-instance v0, Ll/᩺ܳ;

    invoke-direct {v0, p0, p0}, Ll/᩺ܳ;-><init>(Ll/ܰܳ;Ll/ܰܳ;)V

    .line 181
    iput-object v0, p0, Ll/ܰܳ;->mDelegate:Ll/֨ᩴ;

    .line 183
    :cond_0
    iget-object v0, p0, Ll/ܰܳ;->mDelegate:Ll/֨ᩴ;

    return-object v0
.end method

.method public getSupportActionBar()Ll/ۖ᩸;
    .locals 1

    .line 90
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩴ;->ܳ()Ll/ۖ᩸;

    move-result-object v0

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    .line 172
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩴ;->ۚ()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 77
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩴ;->۫()V

    .line 78
    invoke-super {p0, p1}, Ll/ۧۤ;->onCreate(Landroid/os/Bundle;)V

    .line 79
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֨ᩴ;->֫()V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 138
    invoke-super {p0}, Ll/ۧۤ;->onStop()V

    .line 139
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩴ;->ܶ()V

    return-void
.end method

.method public onSupportActionModeFinished(Ll/ۢ۫;)V
    .locals 0

    return-void
.end method

.method public onSupportActionModeStarted(Ll/ۢ۫;)V
    .locals 0

    return-void
.end method

.method public onWindowStartingSupportActionMode(Ll/ᩳ۫;)Ll/ۢ۫;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public setContentView(I)V
    .locals 1

    .line 95
    invoke-virtual {p0}, Ll/ۧۤ;->initializeViewTreeOwners()V

    .line 96
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֨ᩴ;->ۤ(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 101
    invoke-virtual {p0}, Ll/ۧۤ;->initializeViewTreeOwners()V

    .line 102
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֨ᩴ;->ۙ(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 107
    invoke-virtual {p0}, Ll/ۧۤ;->initializeViewTreeOwners()V

    .line 108
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/֨ᩴ;->᩷(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    .line 126
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 127
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/֨ᩴ;->ۙ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 120
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 121
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֨ᩴ;->ۙ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 212
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public supportRequestWindowFeature(I)Z
    .locals 1

    .line 164
    invoke-virtual {p0}, Ll/ܰܳ;->getDelegate()Ll/֨ᩴ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֨ᩴ;->᩷(I)Z

    move-result p1

    return p1
.end method
