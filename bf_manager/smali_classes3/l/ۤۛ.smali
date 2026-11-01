.class public final Ll/ۤۛ;
.super Ljava/lang/Object;
.source "CB27"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:Ll/֨ܿ;

.field public final synthetic ᩶:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Ll/֨ܿ;Landroid/graphics/Typeface;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۛ;->ܺ:Ll/֨ܿ;

    iput-object p2, p0, Ll/ۤۛ;->᩶:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 58
    iget-object v0, p0, Ll/ۤۛ;->ܺ:Ll/֨ܿ;

    iget-object v1, p0, Ll/ۤۛ;->᩶:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Ll/֨ܿ;->ۙ(Landroid/graphics/Typeface;)V

    return-void
.end method
