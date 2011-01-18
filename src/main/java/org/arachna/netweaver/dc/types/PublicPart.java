/**
 *
 */
package org.arachna.netweaver.dc.types;

/**
 * Public part of a development component.
 * 
 * @author Dirk Weigenand
 */
public class PublicPart {
    /**
     * description of public part.
     */
    private String description = "";

    /**
     * name of public part.
     */
    private String publicPart = "";

    /**
     * caption of public part.
     */
    private String caption = "";

    /**
     * Create a new public part object.
     * 
     * @param name
     *            name of public part.
     * @param caption
     *            caption of public part.
     * @param description
     *            description of public part.
     */
    public PublicPart(final String name, final String caption, final String description) {
        this.publicPart = name;
        this.caption = caption;
        this.description = description;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @return the publicPart
     */
    public String getPublicPart() {
        return publicPart;
    }

    /**
     * @param publicPart
     *            the publicPart to set
     */
    public void setPublicPart(final String publicPart) {
        this.publicPart = publicPart;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("PublicPart [publicPart=%s, description=%s]", publicPart, description);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((publicPart == null) ? 0 : publicPart.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PublicPart other = (PublicPart)obj;
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        }
        else if (!description.equals(other.description)) {
            return false;
        }
        if (publicPart == null) {
            if (other.publicPart != null) {
                return false;
            }
        }
        else if (!publicPart.equals(other.publicPart)) {
            return false;
        }

        return true;
    }

    /**
     * @return the caption
     */
    public final String getCaption() {
        return caption;
    }

    /**
     * @param caption
     *            the caption to set
     */
    public final void setCaption(final String caption) {
        this.caption = caption;
    }

}