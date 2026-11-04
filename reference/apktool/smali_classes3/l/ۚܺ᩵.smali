.class public final Ll/ۚܺ᩵;
.super Ljava/lang/Object;
.source "BIW9"

# interfaces
.implements Ll/᩷ܿۗ;


# instance fields
.field public final ۙ:Ljava/lang/Object;

.field public final ۤ:I

.field public final ᩷:I


# direct methods
.method public constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Ll/ۚܺ᩵;->ۤ:I

    .line 13
    iput p2, p0, Ll/ۚܺ᩵;->᩷:I

    .line 14
    iput-object p3, p0, Ll/ۚܺ᩵;->ۙ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getData()Ljava/lang/Object;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۚܺ᩵;->ۙ:Ljava/lang/Object;

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    .line 19
    iget v0, p0, Ll/ۚܺ᩵;->ۤ:I

    return v0
.end method

.method public final ۫()I
    .locals 1

    .line 24
    iget v0, p0, Ll/ۚܺ᩵;->᩷:I

    return v0
.end method
