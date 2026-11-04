.class public final Ll/۟۫ܺ;
.super Ljava/lang/Object;
.source "D946"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final ܰ:Ll/֫ۖ᩸;


# direct methods
.method public constructor <init>(Ll/֫ۖ᩸;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/۟۫ܺ;->ܰ:Ll/֫ۖ᩸;

    return-void
.end method

.method public static ۙ(Ll/֫ۖ᩸;)V
    .locals 2

    .line 16
    invoke-virtual {p0}, Ll/֫ۖ᩸;->ۙ()Ll/᩹ۖ᩸;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/۟۫ܺ;

    invoke-direct {v1, p0}, Ll/۟۫ܺ;-><init>(Ll/֫ۖ᩸;)V

    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 36
    iget-object p1, p0, Ll/۟۫ܺ;->ܰ:Ll/֫ۖ᩸;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/֫ۖ᩸;->᩷(Z)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
