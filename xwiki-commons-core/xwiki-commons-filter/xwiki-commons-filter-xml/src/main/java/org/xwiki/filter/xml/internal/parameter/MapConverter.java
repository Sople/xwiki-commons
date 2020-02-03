/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.filter.xml.internal.parameter;

import java.util.Map;

import com.thoughtworks.xstream.mapper.Mapper;

/**
 * Add support for {@link Map} to {@link com.thoughtworks.xstream.converters.collections.MapConverter}.
 * 
 * @version $Id$
 * @since 11.10.3
 * @since 12.1RC1
 */
public class MapConverter extends com.thoughtworks.xstream.converters.collections.MapConverter
{
    /**
     * @param mapper the mapper
     */
    public MapConverter(Mapper mapper)
    {
        super(mapper);
    }

    @Override
    public boolean canConvert(Class type)
    {
        return super.canConvert(type) || type == Map.class;
    }
}
